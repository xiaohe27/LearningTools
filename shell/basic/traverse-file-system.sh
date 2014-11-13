if [ $# -eq 1 ]
 then curDir=$1
else 
curDir=`pwd`
fi

for file in $curDir/*
do
  echo "Hi:$file"; 
  
  if [ -d "$file" ]; then echo "$file is a directory!";
 	sh "traverse-file-system.sh" $file
  fi

done
