cmake_minimum_required(VERSION 3.10)
project(JnaSample)
set(SRC_DIR ${CMAKE_CURRENT_SOURCE_DIR}/src/main/cpp)
add_executable(JnaSample ${SRC_DIR}/jna.cxx)

