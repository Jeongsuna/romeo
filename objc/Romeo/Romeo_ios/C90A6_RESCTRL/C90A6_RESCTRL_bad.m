//
//  C90A6_RESCTRL_bad.m
//  Romeo
//
//  Created by Seungcheol on 2023/06/05.
//  Copyright © 2023 Jemin Kim. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "archive.h"


void bad(const char *filename, int flags) {
  struct archive_entry *entry;
  struct archive *a = archive_read_new();
  struct archive *ext = archive_write_disk_new();
  archive_write_disk_set_options(ext, flags);
  archive_read_support_format_tar(a);

  if ((archive_read_open_filename(a, filename, 10240))) {
    return;
  }

  for (;;) {
    int r = archive_read_next_header(a, &entry);
    if (r == ARCHIVE_EOF) {
      break;
    }
    if (r != ARCHIVE_OK) {
      return;
    }
  }
  archive_read_close(a);
  archive_read_free(a);

  archive_write_close(ext);
  archive_write_free(ext);

}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        const char *filename = "/path/to/archive.tar";
        int flags = ARCHIVE_EXTRACT_TIME;
        bad(filename, flags);
    }
    return 0;
}

