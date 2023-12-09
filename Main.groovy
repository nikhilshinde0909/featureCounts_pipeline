/***********************************************************
 ** Author: Nikhil Shinde <sd1172@srmist.edu.in>
 ** Last Update: 2022/02/24
 *********************************************************/

VERSION="1.00"

//option strings to pass to tools

featurecounts_option1="--primary -t exon -g gene_id -F GTF"
featurecounts_option2="--primary -t exon -g transcript_id -F GTF"

load args[0]

codeBase = file(bpipe.Config.config.script).parentFile.absolutePath

load codeBase+"/tools.groovy"

load codeBase+"/stages/Counts.groovy"

nthreads=bpipe.Config.config.maxThreads

run { get_counts } 

