CC=gcc
CPP=g++
DEBUG=-g
#CFLAGS=-c
CFLAGS=-c -D OMITGOOD -D OMITBAD
LFLAGS=-lpthread

INCLUDES=-I testcasesupport

SUPPORT_PATH=testcasesupport/

MAIN=$(SUPPORT_PATH)main_linux.cpp
MAIN_OBJECT=main_linux.o

C_SUPPORT_FILES=$(SUPPORT_PATH)io.c $(SUPPORT_PATH)std_thread.c
C_SUPPORT_OBJECTS=io.o std_thread.o

# only grab the .c files without "w32" or "wchar_t" in the name
C_SOURCES=$(filter-out $(wildcard C*/*/CWE*w32*.c) $(wildcard C*/*/CWE*wchar_t*.c),$(wildcard C*/*/*.c))
C_OBJECTS=$(C_SOURCES:.c=.o)

# only grab the .cpp files without "w32" or "wchar_t" in the name
CPP_SOURCES=$(filter-out $(wildcard C*/*/CWE*w32*.cpp) $(wildcard C*/*/CWE*wchar_t*.cpp),$(wildcard C*/*/*.cpp))
CPP_OBJECTS=$(CPP_SOURCES:.cpp=.o)

OBJECTS=$(MAIN_OBJECT) $(C_OBJECTS) $(CPP_OBJECTS) $(C_SUPPORT_OBJECTS)
TARGET=all-testcases

all: $(TARGET)

$(TARGET) : $(OBJECTS)
#	$(CPP) $(LFLAGS) $(OBJECTS) -o $(TARGET)

$(C_OBJECTS) : $(C_SOURCES)
	$(CC) $(CFLAGS) $(INCLUDES) $(@:.o=.c) -o $@

$(CPP_OBJECTS) : $(CPP_SOURCES)
	$(CC) $(CFLAGS) $(INCLUDES) $(@:.o=.cpp) -o $@

$(C_SUPPORT_OBJECTS) : $(C_SUPPORT_FILES)
	$(CC) $(CFLAGS) $(INCLUDES) $(SUPPORT_PATH)$(@:.o=.c) -o $@

$(MAIN_OBJECT) : $(MAIN)
	$(CC) $(CFLAGS) $(INCLUDES) $(MAIN) -o $@

clean:
	find . -name "*.o" -exec rm -rf {} \;