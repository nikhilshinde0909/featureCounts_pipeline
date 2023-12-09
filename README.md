# featureCounts_pipeline
featureCouts we often use for count reads for differential expression. Here we report a pipeline that take *.bam inputs along with annotation *.gtfs will provide counts and summary for the lncRNAs and Known Protein Coding Transcripts.

# Implementation

1. Clone the featureCounts_pipeline directory to your local system using git commamd as follows
```
git clone https://github.com/nikhilshinde0909/featureCounts_pipeline.git
```

2. Install featureCounts and bpipe using conda
```
conda install -c bioconda subread bpipe
```
3. Add path of featureCouns command to tools.goovy file provided with pipeline
4. Prepare datasets *.bam files, *.gtfs, create data directory in your working dir and copy *.bam and *.gtfs to it.
5. Refer data_tamplete.txt and create data.txt file to data dir; add out_name, gtf_Anno_KPCT, gtf_Anno_Lnc and aligned_bam to the same along with file paths.
6. Now your pipeline is ready to execute.
7. Run follwing command
```
bpipe path_to_featureCounts_pipe/Main.groovy data/data.txt
```

# Thanks for using featureCounts Pipeline ...!!

