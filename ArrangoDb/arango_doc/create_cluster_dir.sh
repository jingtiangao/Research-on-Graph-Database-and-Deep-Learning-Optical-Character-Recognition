cd /home/gaoziyang/
mkdir arangodb_cluster
chmod 777 * -R
cd arangodb_cluster/
mkdir agency1
mkdir agency2
mkdir agency3

mkdir coordinator
mkdir coordinator2
mkdir coordinator3
mkdir coordinator4
mkdir coordinator5
mkdir coordinator6
mkdir coordinator7
mkdir coordinator8
mkdir coordinator9
mkdir coordinator10
mkdir coordinator11
mkdir coordinator12

mkdir primary1
mkdir primary2
mkdir primary3
mkdir primary4
mkdir primary5
mkdir primary6
mkdir primary7
mkdir primary8
mkdir primary9
mkdir primary10
mkdir primary11
mkdir primary12
mkdir primary13
mkdir primary14
mkdir primary15
mkdir primary16
mkdir primary17
mkdir primary18
mkdir primary19
mkdir primary20
mkdir primary21


chmod 777 * -R

arangodb --starter.data-dir=./db2 --starter.join 10.61.2.206:4000

