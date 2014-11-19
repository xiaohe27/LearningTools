rdiffdir [options] sig[nature] basis_dir signature_file
rdiffdir [options] delta full_sigtar {incr_sigtar} new_dir delta_file

rdiffdir [options] patch

basis_dir delta_file

rdiffdir [options] tar basis_dir tar_file

If signature_file or delta_file are "-", the data will be read from stdin or written to stdout as appropriate.

In signature and delta modes, rdiffdir accepts duplicity-like selection options including --exclude, --exclude-filelist-stdin, etc. See the duplicity(1) manual page for more information.

-x is NOT supported.
And notice that in order to match any files with suffix ".xml", you need to write "**.xml"
