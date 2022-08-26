// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshiftserverless;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshiftserverless.NamespaceArgs;
import com.pulumi.aws.redshiftserverless.inputs.NamespaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new Amazon Redshift Serverless Namespace.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.redshiftserverless.Namespace;
 * import com.pulumi.aws.redshiftserverless.NamespaceArgs;
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
 *         var example = new Namespace(&#34;example&#34;, NamespaceArgs.builder()        
 *             .namespaceName(&#34;concurrency-scaling&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Redshift Serverless Namespaces can be imported using the `namespace_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:redshiftserverless/namespace:Namespace example example
 * ```
 * 
 */
@ResourceType(type="aws:redshiftserverless/namespace:Namespace")
public class Namespace extends com.pulumi.resources.CustomResource {
    /**
     * The password of the administrator for the first database created in the namespace.
     * 
     */
    @Export(name="adminUserPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> adminUserPassword;

    /**
     * @return The password of the administrator for the first database created in the namespace.
     * 
     */
    public Output<Optional<String>> adminUserPassword() {
        return Codegen.optional(this.adminUserPassword);
    }
    /**
     * The username of the administrator for the first database created in the namespace.
     * 
     */
    @Export(name="adminUsername", type=String.class, parameters={})
    private Output<String> adminUsername;

    /**
     * @return The username of the administrator for the first database created in the namespace.
     * 
     */
    public Output<String> adminUsername() {
        return this.adminUsername;
    }
    /**
     * Amazon Resource Name (ARN) of the Redshift Serverless Namespace.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Redshift Serverless Namespace.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the first database created in the namespace.
     * 
     */
    @Export(name="dbName", type=String.class, parameters={})
    private Output<String> dbName;

    /**
     * @return The name of the first database created in the namespace.
     * 
     */
    public Output<String> dbName() {
        return this.dbName;
    }
    /**
     * The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
     * 
     */
    @Export(name="defaultIamRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultIamRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM role to set as a default in the namespace.
     * 
     */
    public Output<Optional<String>> defaultIamRoleArn() {
        return Codegen.optional(this.defaultIamRoleArn);
    }
    /**
     * A list of IAM roles to associate with the namespace.
     * 
     */
    @Export(name="iamRoles", type=List.class, parameters={String.class})
    private Output<List<String>> iamRoles;

    /**
     * @return A list of IAM roles to associate with the namespace.
     * 
     */
    public Output<List<String>> iamRoles() {
        return this.iamRoles;
    }
    /**
     * The ARN of the Amazon Web Services Key Management Service key used to encrypt your data.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return The ARN of the Amazon Web Services Key Management Service key used to encrypt your data.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The types of logs the namespace can export. Available export types are `userlog`, `connectionlog`, and `useractivitylog`.
     * 
     */
    @Export(name="logExports", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> logExports;

    /**
     * @return The types of logs the namespace can export. Available export types are `userlog`, `connectionlog`, and `useractivitylog`.
     * 
     */
    public Output<Optional<List<String>>> logExports() {
        return Codegen.optional(this.logExports);
    }
    /**
     * The Redshift Namespace ID.
     * 
     */
    @Export(name="namespaceId", type=String.class, parameters={})
    private Output<String> namespaceId;

    /**
     * @return The Redshift Namespace ID.
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }
    /**
     * The name of the namespace.
     * 
     */
    @Export(name="namespaceName", type=String.class, parameters={})
    private Output<String> namespaceName;

    /**
     * @return The name of the namespace.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Namespace(String name) {
        this(name, NamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Namespace(String name, NamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Namespace(String name, NamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshiftserverless/namespace:Namespace", name, args == null ? NamespaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Namespace(String name, Output<String> id, @Nullable NamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshiftserverless/namespace:Namespace", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Namespace get(String name, Output<String> id, @Nullable NamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Namespace(name, id, state, options);
    }
}
