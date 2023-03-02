#include <stdio.h>
#include <stdlib.h>

int main() {
    // Flaw:
    FILE *pipe = popen("/bin/ls /", "r");
    if (!pipe) {
        NSLog(@"Error");
        return;
    }

    char buffer[128];
    NSMutableString *output = [[NSMutableString alloc] init];
    while (fgets(buffer, sizeof(buffer), pipe)) {
        [output appendString:[NSString stringWithUTF8String:buffer]];
    }

    NSLog(@"%@", output);
    pclose(pipe);

    return 0;
}
