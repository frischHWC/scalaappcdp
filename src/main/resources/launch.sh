#!/usr/bin/env bash

export DIR="/root/scalaappcdp"

echo "*** Starting to launch program ***"

    cd $DIR

echo "Launching jar via java command"

    java -jar scalaappcdp.jar $@

    sleep 1

echo "*** Finished program ***"