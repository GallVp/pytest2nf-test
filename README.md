# pytest2nf-test

Converts a Nextflow component pytest to nf-test. The Antlr grammar and associated Java classes are taken from the [nextflow/language-server](https://github.com/nextflow-io/language-server). The converter code is written in Kotlin which is compiled into Java byte code for execution on Java Runtime.  

## Assumptions

1. OpenJDK 17
2. The component `main.nf` file contains a single process or workflow
3. The component `main.nf` and pytest `main.nf` both adhere to nextflow/language-server grammar

## Build

```bash
./gradlew installDist
```
The built executable is placed at `./build/install/pytest2nf-test/bin/pytest2nf-test` directory. It can also be moved to a directory which on PATH. It is preferable to move the executable to a directory which is on PATH or add the `./build/install/pytest2nf-test/bin` directory to PATH.

Another alternative is to create an alias in your shell configuration file.

```bash
alias pytest2nf-test=${PWD}/build/install/pytest2nf-test/bin/pytest2nf-test
```

## Test

### General module

```bash
pytest2nf-test \
    --main test/cadd/main.nf \
    --test test/cadd/tests/main.nf \
    --output test/cadd/tests/main.nf.test \
    --data-dict test/test_data.config

pytest2nf-test \
    --main test/amps/main.nf \
    --test test/amps/tests/main.nf \
    --output test/amps/tests/main.nf.test \
    --data-dict test/test_data.config

pytest2nf-test \
    --main test/vcf_phase_shapeit5/main.nf \
    --test test/vcf_phase_shapeit5/tests/main.nf \
    --output test/vcf_phase_shapeit5/tests/main.nf.test \
    --data-dict test/test_data.config
```

### nf-core module

From the nf-core/modules directory,

```
/path/to/build/install/pytest2nf-test/bin/pytest2nf-test \
    --nf-core-module canu
```

## Nextflow Antlr Grammar

- Source: <https://github.com/nextflow-io/language-server>
- Version: [dff88b5](https://github.com/nextflow-io/language-server/tree/dff88b54e6c753fefd4e9456d5d245b1806ff34c)
- License: Apache License 2.0
