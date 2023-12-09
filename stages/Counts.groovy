/***********************************************************
 ** Author: Nikhil Shinde <sd1172@srmist.edu.in>
 ** Last Update: 
 *********************************************************/

counts_dir="counts"

count_reads_kpct = {
    output.dir=counts_dir
    produce (out_name+"_KPCT.counts"){
           exec """
		$featureCounts -T $threads $featurecounts_option1
			       -a $gtf_Anno_KPCT -o $output $aligned_bam ;
		"""
    }
}

count_reads_lnc = {
    output.dir=counts_dir
    produce (out_name+"_Lnc.counts"){
           exec """
                $featureCounts -T $threads $featurecounts_option2
                               -a $gtf_Anno_Lnc -o $output $aligned_bam ;
                """
    }
}


get_counts = segment {count_reads_kpct + count_reads_lnc }
