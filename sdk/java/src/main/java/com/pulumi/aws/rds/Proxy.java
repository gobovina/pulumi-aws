// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rds.ProxyArgs;
import com.pulumi.aws.rds.inputs.ProxyState;
import com.pulumi.aws.rds.outputs.ProxyAuth;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an RDS DB proxy resource. For additional information, see the [RDS User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-proxy.html).
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rds.Proxy;
 * import com.pulumi.aws.rds.ProxyArgs;
 * import com.pulumi.aws.rds.inputs.ProxyAuthArgs;
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
 *         var example = new Proxy(&#34;example&#34;, ProxyArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .debugLogging(false)
 *             .engineFamily(&#34;MYSQL&#34;)
 *             .idleClientTimeout(1800)
 *             .requireTls(true)
 *             .roleArn(exampleAwsIamRole.arn())
 *             .vpcSecurityGroupIds(exampleAwsSecurityGroup.id())
 *             .vpcSubnetIds(exampleAwsSubnet.id())
 *             .auths(ProxyAuthArgs.builder()
 *                 .authScheme(&#34;SECRETS&#34;)
 *                 .description(&#34;example&#34;)
 *                 .iamAuth(&#34;DISABLED&#34;)
 *                 .secretArn(exampleAwsSecretsmanagerSecret.arn())
 *                 .build())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Name&#34;, &#34;example&#34;),
 *                 Map.entry(&#34;Key&#34;, &#34;value&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import DB proxies using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:rds/proxy:Proxy example example
 * ```
 * 
 */
@ResourceType(type="aws:rds/proxy:Proxy")
public class Proxy extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) for the proxy.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) for the proxy.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Configuration block(s) with authorization mechanisms to connect to the associated instances or clusters. Described below.
     * 
     */
    @Export(name="auths", refs={List.class,ProxyAuth.class}, tree="[0,1]")
    private Output<List<ProxyAuth>> auths;

    /**
     * @return Configuration block(s) with authorization mechanisms to connect to the associated instances or clusters. Described below.
     * 
     */
    public Output<List<ProxyAuth>> auths() {
        return this.auths;
    }
    /**
     * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
     * 
     */
    @Export(name="debugLogging", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> debugLogging;

    /**
     * @return Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
     * 
     */
    public Output<Optional<Boolean>> debugLogging() {
        return Codegen.optional(this.debugLogging);
    }
    /**
     * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string for a database client application.
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output<String> endpoint;

    /**
     * @return The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string for a database client application.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * The kinds of databases that the proxy can connect to. This value determines which database network protocol the proxy recognizes when it interprets network traffic to and from the database. For Aurora MySQL, RDS for MariaDB, and RDS for MySQL databases, specify `MYSQL`. For Aurora PostgreSQL and RDS for PostgreSQL databases, specify `POSTGRESQL`. For RDS for Microsoft SQL Server, specify `SQLSERVER`. Valid values are `MYSQL`, `POSTGRESQL`, and `SQLSERVER`.
     * 
     */
    @Export(name="engineFamily", refs={String.class}, tree="[0]")
    private Output<String> engineFamily;

    /**
     * @return The kinds of databases that the proxy can connect to. This value determines which database network protocol the proxy recognizes when it interprets network traffic to and from the database. For Aurora MySQL, RDS for MariaDB, and RDS for MySQL databases, specify `MYSQL`. For Aurora PostgreSQL and RDS for PostgreSQL databases, specify `POSTGRESQL`. For RDS for Microsoft SQL Server, specify `SQLSERVER`. Valid values are `MYSQL`, `POSTGRESQL`, and `SQLSERVER`.
     * 
     */
    public Output<String> engineFamily() {
        return this.engineFamily;
    }
    /**
     * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set this value higher or lower than the connection timeout limit for the associated database.
     * 
     */
    @Export(name="idleClientTimeout", refs={Integer.class}, tree="[0]")
    private Output<Integer> idleClientTimeout;

    /**
     * @return The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set this value higher or lower than the connection timeout limit for the associated database.
     * 
     */
    public Output<Integer> idleClientTimeout() {
        return this.idleClientTimeout;
    }
    /**
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can&#39;t end with a hyphen or contain two consecutive hyphens.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can&#39;t end with a hyphen or contain two consecutive hyphens.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     * 
     */
    @Export(name="requireTls", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> requireTls;

    /**
     * @return A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     * 
     */
    public Output<Optional<Boolean>> requireTls() {
        return Codegen.optional(this.requireTls);
    }
    /**
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * One or more VPC security group IDs to associate with the new proxy.
     * 
     */
    @Export(name="vpcSecurityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> vpcSecurityGroupIds;

    /**
     * @return One or more VPC security group IDs to associate with the new proxy.
     * 
     */
    public Output<List<String>> vpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }
    /**
     * One or more VPC subnet IDs to associate with the new proxy.
     * 
     */
    @Export(name="vpcSubnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> vpcSubnetIds;

    /**
     * @return One or more VPC subnet IDs to associate with the new proxy.
     * 
     */
    public Output<List<String>> vpcSubnetIds() {
        return this.vpcSubnetIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Proxy(String name) {
        this(name, ProxyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Proxy(String name, ProxyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Proxy(String name, ProxyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/proxy:Proxy", name, args == null ? ProxyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Proxy(String name, Output<String> id, @Nullable ProxyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/proxy:Proxy", name, state, makeResourceOptions(options, id));
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
    public static Proxy get(String name, Output<String> id, @Nullable ProxyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Proxy(name, id, state, options);
    }
}
