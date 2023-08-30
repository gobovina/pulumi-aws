// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rds.ProxyDefaultTargetGroupArgs;
import com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupState;
import com.pulumi.aws.rds.outputs.ProxyDefaultTargetGroupConnectionPoolConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an RDS DB proxy default target group resource.
 * 
 * The `aws.rds.ProxyDefaultTargetGroup` behaves differently from normal resources, in that the provider does not _create_ or _destroy_ this resource, since it implicitly exists as part of an RDS DB Proxy. On the provider resource creation it is automatically imported and on resource destruction, the provider performs no actions in RDS.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rds.Proxy;
 * import com.pulumi.aws.rds.ProxyArgs;
 * import com.pulumi.aws.rds.inputs.ProxyAuthArgs;
 * import com.pulumi.aws.rds.ProxyDefaultTargetGroup;
 * import com.pulumi.aws.rds.ProxyDefaultTargetGroupArgs;
 * import com.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupConnectionPoolConfigArgs;
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
 *         var exampleProxy = new Proxy(&#34;exampleProxy&#34;, ProxyArgs.builder()        
 *             .debugLogging(false)
 *             .engineFamily(&#34;MYSQL&#34;)
 *             .idleClientTimeout(1800)
 *             .requireTls(true)
 *             .roleArn(aws_iam_role.example().arn())
 *             .vpcSecurityGroupIds(aws_security_group.example().id())
 *             .vpcSubnetIds(aws_subnet.example().id())
 *             .auths(ProxyAuthArgs.builder()
 *                 .authScheme(&#34;SECRETS&#34;)
 *                 .description(&#34;example&#34;)
 *                 .iamAuth(&#34;DISABLED&#34;)
 *                 .secretArn(aws_secretsmanager_secret.example().arn())
 *                 .build())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Name&#34;, &#34;example&#34;),
 *                 Map.entry(&#34;Key&#34;, &#34;value&#34;)
 *             ))
 *             .build());
 * 
 *         var exampleProxyDefaultTargetGroup = new ProxyDefaultTargetGroup(&#34;exampleProxyDefaultTargetGroup&#34;, ProxyDefaultTargetGroupArgs.builder()        
 *             .dbProxyName(exampleProxy.name())
 *             .connectionPoolConfig(ProxyDefaultTargetGroupConnectionPoolConfigArgs.builder()
 *                 .connectionBorrowTimeout(120)
 *                 .initQuery(&#34;SET x=1, y=2&#34;)
 *                 .maxConnectionsPercent(100)
 *                 .maxIdleConnectionsPercent(50)
 *                 .sessionPinningFilters(&#34;EXCLUDE_VARIABLE_SETS&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import DB proxy default target groups using the `db_proxy_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:rds/proxyDefaultTargetGroup:ProxyDefaultTargetGroup example example
 * ```
 * 
 */
@ResourceType(type="aws:rds/proxyDefaultTargetGroup:ProxyDefaultTargetGroup")
public class ProxyDefaultTargetGroup extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) representing the target group.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) representing the target group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The settings that determine the size and behavior of the connection pool for the target group.
     * 
     */
    @Export(name="connectionPoolConfig", refs={ProxyDefaultTargetGroupConnectionPoolConfig.class}, tree="[0]")
    private Output<ProxyDefaultTargetGroupConnectionPoolConfig> connectionPoolConfig;

    /**
     * @return The settings that determine the size and behavior of the connection pool for the target group.
     * 
     */
    public Output<ProxyDefaultTargetGroupConnectionPoolConfig> connectionPoolConfig() {
        return this.connectionPoolConfig;
    }
    /**
     * Name of the RDS DB Proxy.
     * 
     */
    @Export(name="dbProxyName", refs={String.class}, tree="[0]")
    private Output<String> dbProxyName;

    /**
     * @return Name of the RDS DB Proxy.
     * 
     */
    public Output<String> dbProxyName() {
        return this.dbProxyName;
    }
    /**
     * The name of the default target group.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the default target group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProxyDefaultTargetGroup(String name) {
        this(name, ProxyDefaultTargetGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProxyDefaultTargetGroup(String name, ProxyDefaultTargetGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProxyDefaultTargetGroup(String name, ProxyDefaultTargetGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/proxyDefaultTargetGroup:ProxyDefaultTargetGroup", name, args == null ? ProxyDefaultTargetGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProxyDefaultTargetGroup(String name, Output<String> id, @Nullable ProxyDefaultTargetGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/proxyDefaultTargetGroup:ProxyDefaultTargetGroup", name, state, makeResourceOptions(options, id));
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
    public static ProxyDefaultTargetGroup get(String name, Output<String> id, @Nullable ProxyDefaultTargetGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProxyDefaultTargetGroup(name, id, state, options);
    }
}
