cmake_minimum_required(VERSION 3.12)

set(PICO_SDK_PATH "/home/consmariano/PicoW-pi7/pico-sdk")
set(PICO_BOARD "pico_w")
set(PICO_TOOLCHAIN_PATH "/usr/bin/arm-none-eabi-gcc")

# Name project
SET(ProjectName Picow-pi7)

# Set any variables required for importing libraries
SET(FREERTOS_KERNEL_PATH ${CMAKE_CURRENT_SOURCE_DIR}/lib/FreeRTOS-Kernel)

# Import those libraries
include(pico_sdk_import.cmake)
include(${FREERTOS_KERNEL_PATH}/portable/ThirdParty/GCC/RP2040/FreeRTOS_Kernel_import.cmake)

# Define project
project(${ProjectName})

# Initialize the Raspberry Pi Pico SDK
pico_sdk_init()

# Add subdirectories
add_subdirectory(src)

# if you have anything in "lib" folder then uncomment below - remember to add a CMakeLists.txt
# file to the "lib" directory
#add_subdirectory(lib)