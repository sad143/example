#!/bin/bash
echo "Vvedite put do directory"
read dir
if cd $dir
then
ls -R | grep ":$" |sed -e "$s/[^-][^\/]*\// |/g" > list.txt
echo "File pod name list v directory create uspechno!"
else
echo "Takoy netu"
fi