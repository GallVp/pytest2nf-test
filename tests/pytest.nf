#!/usr/bin/env nextflow

nextflow.enable.dsl = 2

include { CADD as DO_CADD } from '../../../../modules/nf-core/cadd/main.nf'

workflow test_cadd {

    input = [
        [ id:'test', single_end:false ], // meta map
        file(params.test_data['homo_sapiens']['illumina']['test_genome_vcf'], checkIfExists: true)
    ]

    DO_CADD ( input, file(System.getenv('PWD')) )
}
