#!/usr/bin/env bash

# Export your host here to launch the program on the platform
# export HOST=

sbt clean assembly

export USER=root
export DEST_DIR="/home/root/scalaappcdp"

echo "Create needed directory on platform and send required files there"

ssh ${USER}@${HOST} "mkdir -p ${DEST_DIR}/"
ssh ${USER}@${HOST} "mkdir -p ${DEST_DIR}/resources/"

scp src/main/resources/*.properties ${USER}@${HOST}:${DEST_DIR}/
scp src/main/resources/launch.sh ${USER}@${HOST}:${DEST_DIR}/

ssh ${USER}@${HOST} "chmod +x ${DEST_DIR}/launch.sh"

scp target/scala-2.12/scalaappcdp*.jar ${USER}@${HOST}:${DEST_DIR}/scalaappcdp.jar

echo "Finished to send required files"

echo "Launch script on platform to launch program properly"
ssh ${USER}@${HOST} 'bash -s' < src/main/resources/launch.sh $@
echo "Program finished"


