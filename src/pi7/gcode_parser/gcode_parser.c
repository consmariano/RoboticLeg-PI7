#include "gcode_parser.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

GCode parse_gcode(const char *line) {
    GCode gcode = {0};

    char *token = strtok(line, " ");
    while (token != NULL) {
        if (token[0] == 'N') {
            gcode.line_number = atoi(&token[1]);
        } else if (token[0] == 'G' || token[0] == 'M') {
            strncpy(gcode.command, token, 3);
        } else if (token[0] == 'X') {
            gcode.x = atof(&token[1]);
            gcode.has_x = 1;
        } else if (token[0] == 'Y') {
            gcode.y = atof(&token[1]);
            gcode.has_y = 1;
        } else if (token[0] == 'Z') {
            gcode.z = atof(&token[1]);
            gcode.has_z = 1;
        } else if (token[0] == ';') {
            strncpy(gcode.comment, token, sizeof(gcode.comment) - 1);
        }
        token = strtok(NULL, " ");
    }

    return gcode;
}