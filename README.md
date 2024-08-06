# mapstruct warning example

For the Mapstruct [issue #3409](https://github.com/mapstruct/mapstruct/issues/3409)

1. Compile the project to get the warning:

       mvn clean compile

   the result:
   
         [INFO] Scanning for projects...
         [INFO] 
         [INFO] ----------------< lv.id.egle.sandbox:mapstruct-example >----------------
         [INFO] Building mapstruct-example 1.0-SNAPSHOT
         [INFO]
         [INFO] --- compiler:3.13.0:compile (default-compile) @ mapstruct-example ---
         [INFO] Recompiling the module because of changed source code.
         [INFO] Compiling 4 source files with javac [debug parameters release 17] to target\classes
         [WARNING] The following options were not recognized by any processor: '[mapstruct.verbose, mapstruct.suppressGeneratorVersionInfoComment, mapstruct.defaultComponentModel, mapstruct.suppressGeneratorTimestamp]'
         [INFO] ------------------------------------------------------------------------
         [INFO] BUILD SUCCESS
         [INFO] ------------------------------------------------------------------------
         [INFO] Total time:  1.700 s
         [INFO] Finished at: 2024-08-06T20:56:12+03:00
         [INFO] ------------------------------------------------------------------------

2. Uncomment the `@Mapper` annotation in [DataMapper.java](src/main/java/lv/id/egle/sandbox/DataMapper.java)
and compile the project again and there will be no warnings.

       [INFO] Scanning for projects...
       [INFO] 
       [INFO] ----------------< lv.id.egle.sandbox:mapstruct-example >----------------
       [INFO] Building mapstruct-example 1.0-SNAPSHOT
       [INFO]   from pom.xml
       [INFO] --------------------------------[ jar ]---------------------------------
       [INFO] 
       [INFO] --- clean:3.3.2:clean (default-clean) @ mapstruct-example ---
       [INFO] Deleting C:\work\vcs\public\mapstruct-example\target
       [INFO]
       [INFO] --- resources:3.3.1:resources (default-resources) @ mapstruct-example ---
       [INFO] Copying 0 resource from src\main\resources to target\classes
       [INFO] Copying 0 resource from src\main\resources to target\classes
       [INFO]
       [INFO] --- compiler:3.13.0:compile (default-compile) @ mapstruct-example ---
       [INFO] Recompiling the module because of changed source code.
       [INFO] Compiling 4 source files with javac [debug parameters release 17] to target\classes
       [INFO] MapStruct: Using accessor naming strategy: org.mapstruct.ap.spi.DefaultAccessorNamingStrategy
       [INFO] MapStruct: Using builder provider: org.mapstruct.ap.spi.DefaultBuilderProvider
       [INFO] MapStruct: Using enum naming strategy: org.mapstruct.ap.spi.DefaultEnumMappingStrategy
       [INFO]  MapStruct: processing: lv.id.egle.sandbox.DataMapper.
       [INFO] - MapStruct: creating bean mapping method implementation for lv.id.egle.sandbox.DataTwo toDataTwo(lv.id.egle.sandbox.DataOne dataOne).
       [INFO] -- MapStruct: mapping property: dataOne.getMyData() to: setMyData(java.lang.String).
       [INFO] -- MapStruct: selecting property mapping: dataOne.getMyData().
       [INFO] ------------------------------------------------------------------------
       [INFO] BUILD SUCCESS
       [INFO] ------------------------------------------------------------------------
       [INFO] Total time:  2.218 s
       [INFO] Finished at: 2024-08-06T20:57:30+03:00
       [INFO] ------------------------------------------------------------------------

