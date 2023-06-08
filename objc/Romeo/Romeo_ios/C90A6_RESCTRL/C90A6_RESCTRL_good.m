//
//  C90A6_RESCTRL_good.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/05.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "archive.h"
#include "archive_entry.h"

int good(const char *filename, int flags) {
    
    const int max_number_of_extraced_entries = 1000;
     const int64_t max_file_size = 1000000000; // 1 GB

     int number_of_extraced_entries = 0;
     int64_t total_file_size = 0;

     struct archive_entry *entry;
     struct archive *a = archive_read_new();
     struct archive *ext = archive_write_disk_new();
     archive_write_disk_set_options(ext, flags);
     archive_read_support_format_tar(a);
     int status = 0;

     if ((archive_read_open_filename(a, filename, 10240))) {
       return -1;
     }

     for (;;) {
       number_of_extraced_entries++;
       if (number_of_extraced_entries > max_number_of_extraced_entries) {
         status = 1;
         break;
       }

       int r = archive_read_next_header(a, &entry);
       if (r == ARCHIVE_EOF) {
         break;
       }
       if (r != ARCHIVE_OK) {
         status = -1;
         break;
       }

       long file_size = archive_entry_size(entry);
         
       total_file_size += file_size;
       if (total_file_size > max_file_size) {
         status = 1;
         break;
       }
     }
     archive_read_close(a);
     archive_read_free(a);

     archive_write_close(ext);
     archive_write_free(ext);

     return status;
}

