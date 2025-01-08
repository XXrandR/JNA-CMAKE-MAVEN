cmake_minimum_required(VERSION 3.10)
project(JnaSample)

set(CMAKE_CXX_STANDARD 14)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

set(SRC_DIR ${CMAKE_CURRENT_SOURCE_DIR}/src/main/cpp)

set(JNASAMPLE_SOURCES
  JnaSample.cpp
  JnaSample.h
)

add_library(JnaSample SHARED ${SRC_DIR}/jna.cpp)
# add_executable(JnaSample ${SRC_DIR}/jna.cpp)

