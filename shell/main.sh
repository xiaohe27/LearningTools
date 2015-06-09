Fst=$1
Snd=$2
shift;
shift;
for arg in "$@"
do
  echo "$arg"
done

echo "$Fst : $Snd" 
