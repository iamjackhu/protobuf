#!/bin/bash

TARGET=$1

echo "generate $TARGET"
rm -rf $TARGET
mkdir $TARGET
cd src/main
protoc -I=proto --${TARGET}_out=../../${TARGET} proto/*.proto