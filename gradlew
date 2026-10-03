```bash
#!/bin/bash

if [ -x "./gradlew" ]; then
    ./gradlew $@
else
    ./gradlew.jar $@
fi
```
