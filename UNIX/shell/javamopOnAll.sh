if [ $# -eq 1 ]
 then curDir=$1
else 
curDir=`pwd`
fi

for file in $curDir/*
do
  
  if [ -d "$file" ]; then
 	sh "javamopOnAll.sh" $file

  elif [ -f "$file" ]; then 
	case $file in
          *.mop )
		sh ../../../../../bin/javamop $file 
		
		rm $curDir/*.aj
		;;

	  *)

		;;

	esac

  else
	echo "ERROR!"
  fi

done
