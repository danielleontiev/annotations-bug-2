# Steps to reproduce

1. Clone repository
2. Run in the terminal:
   ```bash
   sbt ";clean;compile"
   ```
   Output:
   ```
   List(<notype>, <notype>, <notype>, <notype>)
   ```

3. Comment out lines 8 and 12 in `Foo.scala` and run `sbt ";clean;compile"` again:
   ```
   List()
   ```
