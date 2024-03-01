// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsArgs;
import com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsPlainArgs;
import com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs;
import com.pulumi.aws.lakeformation.inputs.GetPermissionsPlainArgs;
import com.pulumi.aws.lakeformation.inputs.GetResourceArgs;
import com.pulumi.aws.lakeformation.inputs.GetResourcePlainArgs;
import com.pulumi.aws.lakeformation.outputs.GetDataLakeSettingsResult;
import com.pulumi.aws.lakeformation.outputs.GetPermissionsResult;
import com.pulumi.aws.lakeformation.outputs.GetResourceResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class LakeformationFunctions {
    /**
     * Get Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = LakeformationFunctions.getDataLakeSettings(GetDataLakeSettingsArgs.builder()
     *             .catalogId(&#34;14916253649&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDataLakeSettingsResult> getDataLakeSettings() {
        return getDataLakeSettings(GetDataLakeSettingsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Get Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = LakeformationFunctions.getDataLakeSettings(GetDataLakeSettingsArgs.builder()
     *             .catalogId(&#34;14916253649&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDataLakeSettingsResult> getDataLakeSettingsPlain() {
        return getDataLakeSettingsPlain(GetDataLakeSettingsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Get Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = LakeformationFunctions.getDataLakeSettings(GetDataLakeSettingsArgs.builder()
     *             .catalogId(&#34;14916253649&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDataLakeSettingsResult> getDataLakeSettings(GetDataLakeSettingsArgs args) {
        return getDataLakeSettings(args, InvokeOptions.Empty);
    }
    /**
     * Get Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = LakeformationFunctions.getDataLakeSettings(GetDataLakeSettingsArgs.builder()
     *             .catalogId(&#34;14916253649&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDataLakeSettingsResult> getDataLakeSettingsPlain(GetDataLakeSettingsPlainArgs args) {
        return getDataLakeSettingsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = LakeformationFunctions.getDataLakeSettings(GetDataLakeSettingsArgs.builder()
     *             .catalogId(&#34;14916253649&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDataLakeSettingsResult> getDataLakeSettings(GetDataLakeSettingsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:lakeformation/getDataLakeSettings:getDataLakeSettings", TypeShape.of(GetDataLakeSettingsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get Lake Formation principals designated as data lake administrators and lists of principal permission entries for default create database and default create table permissions.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetDataLakeSettingsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = LakeformationFunctions.getDataLakeSettings(GetDataLakeSettingsArgs.builder()
     *             .catalogId(&#34;14916253649&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDataLakeSettingsResult> getDataLakeSettingsPlain(GetDataLakeSettingsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lakeformation/getDataLakeSettings:getDataLakeSettings", TypeShape.of(GetDataLakeSettingsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get permissions for a principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. Permissions are granted to a principal, in a Data Catalog, relative to a Lake Formation resource, which includes the Data Catalog, databases, tables, LF-tags, and LF-tag policies. For more information, see [Security and Access Control to Metadata and Data in Lake Formation](https://docs.aws.amazon.com/lake-formation/latest/dg/security-data-access.html).
     * 
     * &gt; **NOTE:** This data source deals with explicitly granted permissions. Lake Formation grants implicit permissions to data lake administrators, database creators, and table creators. For more information, see [Implicit Lake Formation Permissions](https://docs.aws.amazon.com/lake-formation/latest/dg/implicit-permissions.html).
     * 
     * ## Example Usage
     * ### Permissions For A Lake Formation S3 Resource
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsDataLocationArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = LakeformationFunctions.getPermissions(GetPermissionsArgs.builder()
     *             .principal(workflowRole.arn())
     *             .dataLocation(GetPermissionsDataLocationArgs.builder()
     *                 .arn(testAwsLakeformationResource.arn())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### Permissions For A Glue Catalog Database
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsDatabaseArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = LakeformationFunctions.getPermissions(GetPermissionsArgs.builder()
     *             .principal(workflowRole.arn())
     *             .database(GetPermissionsDatabaseArgs.builder()
     *                 .name(testAwsGlueCatalogDatabase.name())
     *                 .catalogId(&#34;110376042874&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### Permissions For Tag-Based Access Control
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicyArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = LakeformationFunctions.getPermissions(GetPermissionsArgs.builder()
     *             .principal(workflowRole.arn())
     *             .lfTagPolicy(GetPermissionsLfTagPolicyArgs.builder()
     *                 .resourceType(&#34;DATABASE&#34;)
     *                 .expressions(                
     *                     GetPermissionsLfTagPolicyExpressionArgs.builder()
     *                         .key(&#34;Team&#34;)
     *                         .values(&#34;Sales&#34;)
     *                         .build(),
     *                     GetPermissionsLfTagPolicyExpressionArgs.builder()
     *                         .key(&#34;Environment&#34;)
     *                         .values(                        
     *                             &#34;Dev&#34;,
     *                             &#34;Production&#34;)
     *                         .build())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetPermissionsResult> getPermissions(GetPermissionsArgs args) {
        return getPermissions(args, InvokeOptions.Empty);
    }
    /**
     * Get permissions for a principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. Permissions are granted to a principal, in a Data Catalog, relative to a Lake Formation resource, which includes the Data Catalog, databases, tables, LF-tags, and LF-tag policies. For more information, see [Security and Access Control to Metadata and Data in Lake Formation](https://docs.aws.amazon.com/lake-formation/latest/dg/security-data-access.html).
     * 
     * &gt; **NOTE:** This data source deals with explicitly granted permissions. Lake Formation grants implicit permissions to data lake administrators, database creators, and table creators. For more information, see [Implicit Lake Formation Permissions](https://docs.aws.amazon.com/lake-formation/latest/dg/implicit-permissions.html).
     * 
     * ## Example Usage
     * ### Permissions For A Lake Formation S3 Resource
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsDataLocationArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = LakeformationFunctions.getPermissions(GetPermissionsArgs.builder()
     *             .principal(workflowRole.arn())
     *             .dataLocation(GetPermissionsDataLocationArgs.builder()
     *                 .arn(testAwsLakeformationResource.arn())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### Permissions For A Glue Catalog Database
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsDatabaseArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = LakeformationFunctions.getPermissions(GetPermissionsArgs.builder()
     *             .principal(workflowRole.arn())
     *             .database(GetPermissionsDatabaseArgs.builder()
     *                 .name(testAwsGlueCatalogDatabase.name())
     *                 .catalogId(&#34;110376042874&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### Permissions For Tag-Based Access Control
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicyArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = LakeformationFunctions.getPermissions(GetPermissionsArgs.builder()
     *             .principal(workflowRole.arn())
     *             .lfTagPolicy(GetPermissionsLfTagPolicyArgs.builder()
     *                 .resourceType(&#34;DATABASE&#34;)
     *                 .expressions(                
     *                     GetPermissionsLfTagPolicyExpressionArgs.builder()
     *                         .key(&#34;Team&#34;)
     *                         .values(&#34;Sales&#34;)
     *                         .build(),
     *                     GetPermissionsLfTagPolicyExpressionArgs.builder()
     *                         .key(&#34;Environment&#34;)
     *                         .values(                        
     *                             &#34;Dev&#34;,
     *                             &#34;Production&#34;)
     *                         .build())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPermissionsResult> getPermissionsPlain(GetPermissionsPlainArgs args) {
        return getPermissionsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get permissions for a principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. Permissions are granted to a principal, in a Data Catalog, relative to a Lake Formation resource, which includes the Data Catalog, databases, tables, LF-tags, and LF-tag policies. For more information, see [Security and Access Control to Metadata and Data in Lake Formation](https://docs.aws.amazon.com/lake-formation/latest/dg/security-data-access.html).
     * 
     * &gt; **NOTE:** This data source deals with explicitly granted permissions. Lake Formation grants implicit permissions to data lake administrators, database creators, and table creators. For more information, see [Implicit Lake Formation Permissions](https://docs.aws.amazon.com/lake-formation/latest/dg/implicit-permissions.html).
     * 
     * ## Example Usage
     * ### Permissions For A Lake Formation S3 Resource
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsDataLocationArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = LakeformationFunctions.getPermissions(GetPermissionsArgs.builder()
     *             .principal(workflowRole.arn())
     *             .dataLocation(GetPermissionsDataLocationArgs.builder()
     *                 .arn(testAwsLakeformationResource.arn())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### Permissions For A Glue Catalog Database
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsDatabaseArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = LakeformationFunctions.getPermissions(GetPermissionsArgs.builder()
     *             .principal(workflowRole.arn())
     *             .database(GetPermissionsDatabaseArgs.builder()
     *                 .name(testAwsGlueCatalogDatabase.name())
     *                 .catalogId(&#34;110376042874&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### Permissions For Tag-Based Access Control
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicyArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = LakeformationFunctions.getPermissions(GetPermissionsArgs.builder()
     *             .principal(workflowRole.arn())
     *             .lfTagPolicy(GetPermissionsLfTagPolicyArgs.builder()
     *                 .resourceType(&#34;DATABASE&#34;)
     *                 .expressions(                
     *                     GetPermissionsLfTagPolicyExpressionArgs.builder()
     *                         .key(&#34;Team&#34;)
     *                         .values(&#34;Sales&#34;)
     *                         .build(),
     *                     GetPermissionsLfTagPolicyExpressionArgs.builder()
     *                         .key(&#34;Environment&#34;)
     *                         .values(                        
     *                             &#34;Dev&#34;,
     *                             &#34;Production&#34;)
     *                         .build())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetPermissionsResult> getPermissions(GetPermissionsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:lakeformation/getPermissions:getPermissions", TypeShape.of(GetPermissionsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get permissions for a principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. Permissions are granted to a principal, in a Data Catalog, relative to a Lake Formation resource, which includes the Data Catalog, databases, tables, LF-tags, and LF-tag policies. For more information, see [Security and Access Control to Metadata and Data in Lake Formation](https://docs.aws.amazon.com/lake-formation/latest/dg/security-data-access.html).
     * 
     * &gt; **NOTE:** This data source deals with explicitly granted permissions. Lake Formation grants implicit permissions to data lake administrators, database creators, and table creators. For more information, see [Implicit Lake Formation Permissions](https://docs.aws.amazon.com/lake-formation/latest/dg/implicit-permissions.html).
     * 
     * ## Example Usage
     * ### Permissions For A Lake Formation S3 Resource
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsDataLocationArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = LakeformationFunctions.getPermissions(GetPermissionsArgs.builder()
     *             .principal(workflowRole.arn())
     *             .dataLocation(GetPermissionsDataLocationArgs.builder()
     *                 .arn(testAwsLakeformationResource.arn())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### Permissions For A Glue Catalog Database
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsDatabaseArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = LakeformationFunctions.getPermissions(GetPermissionsArgs.builder()
     *             .principal(workflowRole.arn())
     *             .database(GetPermissionsDatabaseArgs.builder()
     *                 .name(testAwsGlueCatalogDatabase.name())
     *                 .catalogId(&#34;110376042874&#34;)
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * ### Permissions For Tag-Based Access Control
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsArgs;
     * import com.pulumi.aws.lakeformation.inputs.GetPermissionsLfTagPolicyArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = LakeformationFunctions.getPermissions(GetPermissionsArgs.builder()
     *             .principal(workflowRole.arn())
     *             .lfTagPolicy(GetPermissionsLfTagPolicyArgs.builder()
     *                 .resourceType(&#34;DATABASE&#34;)
     *                 .expressions(                
     *                     GetPermissionsLfTagPolicyExpressionArgs.builder()
     *                         .key(&#34;Team&#34;)
     *                         .values(&#34;Sales&#34;)
     *                         .build(),
     *                     GetPermissionsLfTagPolicyExpressionArgs.builder()
     *                         .key(&#34;Environment&#34;)
     *                         .values(                        
     *                             &#34;Dev&#34;,
     *                             &#34;Production&#34;)
     *                         .build())
     *                 .build())
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPermissionsResult> getPermissionsPlain(GetPermissionsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lakeformation/getPermissions:getPermissions", TypeShape.of(GetPermissionsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a Lake Formation resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetResourceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = LakeformationFunctions.getResource(GetResourceArgs.builder()
     *             .arn(&#34;arn:aws:s3:::tf-acc-test-9151654063908211878&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetResourceResult> getResource(GetResourceArgs args) {
        return getResource(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about a Lake Formation resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetResourceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = LakeformationFunctions.getResource(GetResourceArgs.builder()
     *             .arn(&#34;arn:aws:s3:::tf-acc-test-9151654063908211878&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetResourceResult> getResourcePlain(GetResourcePlainArgs args) {
        return getResourcePlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides details about a Lake Formation resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetResourceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = LakeformationFunctions.getResource(GetResourceArgs.builder()
     *             .arn(&#34;arn:aws:s3:::tf-acc-test-9151654063908211878&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetResourceResult> getResource(GetResourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws:lakeformation/getResource:getResource", TypeShape.of(GetResourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a Lake Formation resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.aws.lakeformation.LakeformationFunctions;
     * import com.pulumi.aws.lakeformation.inputs.GetResourceArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var example = LakeformationFunctions.getResource(GetResourceArgs.builder()
     *             .arn(&#34;arn:aws:s3:::tf-acc-test-9151654063908211878&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetResourceResult> getResourcePlain(GetResourcePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lakeformation/getResource:getResource", TypeShape.of(GetResourceResult.class), args, Utilities.withVersion(options));
    }
}
