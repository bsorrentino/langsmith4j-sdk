#!/bin/bash

TARGET_GEN_DIR="target/gen"

# SOURCE
rm -rf src/main/java/org/bsc/langgraph4j/langsmith/gen
cp -r $TARGET_GEN_DIR/src/main/java/org/bsc/langgraph4j/langsmith/gen src/main/java/org/bsc/langgraph4j/langsmith/gen

# TEST
rm -rf src/test/java/org/bsc/langgraph4j/langsmith/gen
cp -r $TARGET_GEN_DIR/src/test/java/org/bsc/langgraph4j/langsmith/gen src/test/java/org/bsc/langgraph4j/langsmith/gen

# TEST
rm -rf docs
cp -r $TARGET_GEN_DIR/docs .

cp $TARGET_GEN_DIR/pom.xml .
cp -r $TARGET_GEN_DIR/.openapi-generator .

