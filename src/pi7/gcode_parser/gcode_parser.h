#ifndef GCODE_PARSER_H
#define GCODE_PARSER_H

typedef struct {
    int has_x;
    int has_y;
    int has_z;
    float x;
    float y;
    float z;
    int line_number;
    char command[4];
    char comment[256];
} GCode;

GCode parse_gcode(const char *line);

#endif // GCODE_PARSER_H
