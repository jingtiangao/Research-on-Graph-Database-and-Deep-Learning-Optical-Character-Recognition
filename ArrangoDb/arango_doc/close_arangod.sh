ps -ef | grep arangod | grep -v arangod-mxm | cut -c 9-15 | xargs kill -9
