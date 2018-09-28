#!/bin/bash

TARGET=$1

echo "generate $TARGET"
rm -rf $TARGET
mkdir $TARGET
cd src/main

## install protoc first,  brew install protobuf 
protoc -I=proto --${TARGET}_out=../../${TARGET} proto/*.proto
