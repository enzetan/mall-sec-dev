#!/bin/bash
docker rmi -f `docker images -a | grep cipcip | awk '{print $3}'`