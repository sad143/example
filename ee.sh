#!/bin/bash
echo "Vvedite put"
read dir
if cd $dir
then
ls > list.txt
echo "File pod name list v directory create uspechno!"
else
echo "Takoy netu"
fi