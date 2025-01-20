# nxf-pytest2nf-test

Converts a nf-core component pytest to nf-test. The Antlr grammar and associated Java classed are taken from the [nextflow/language-server](https://github.com/nextflow-io/language-server). The converter code is written in Kotlin which is compiled into Java byte code for execution on Java Runtime.  

## Requirements

1. OpenJDK 17

## Build

```bash
./gradlew installDist
```

## Test

```bash
./build/install/nxf-pytest2nf-test/bin/nxf-pytest2nf-test --test tests/data/modules/cadd
```


## Nextflow Antlr Grammar

- Source: <https://github.com/nextflow-io/language-server>
- Version: [dff88b5](https://github.com/nextflow-io/language-server/tree/dff88b54e6c753fefd4e9456d5d245b1806ff34c)
- License: Apache License 2.0
