// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appsync.GraphQLApiArgs;
import com.pulumi.aws.appsync.inputs.GraphQLApiState;
import com.pulumi.aws.appsync.outputs.GraphQLApiAdditionalAuthenticationProvider;
import com.pulumi.aws.appsync.outputs.GraphQLApiLambdaAuthorizerConfig;
import com.pulumi.aws.appsync.outputs.GraphQLApiLogConfig;
import com.pulumi.aws.appsync.outputs.GraphQLApiOpenidConnectConfig;
import com.pulumi.aws.appsync.outputs.GraphQLApiUserPoolConfig;
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

@ResourceType(type="aws:appsync/graphQLApi:GraphQLApi")
public class GraphQLApi extends com.pulumi.resources.CustomResource {
    /**
     * One or more additional authentication providers for the GraphqlApi. Defined below.
     * 
     */
    @Export(name="additionalAuthenticationProviders", refs={List.class,GraphQLApiAdditionalAuthenticationProvider.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GraphQLApiAdditionalAuthenticationProvider>> additionalAuthenticationProviders;

    /**
     * @return One or more additional authentication providers for the GraphqlApi. Defined below.
     * 
     */
    public Output<Optional<List<GraphQLApiAdditionalAuthenticationProvider>>> additionalAuthenticationProviders() {
        return Codegen.optional(this.additionalAuthenticationProviders);
    }
    /**
     * ARN
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
     * 
     */
    @Export(name="authenticationType", refs={String.class}, tree="[0]")
    private Output<String> authenticationType;

    /**
     * @return Authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
     * 
     */
    public Output<String> authenticationType() {
        return this.authenticationType;
    }
    /**
     * Sets the value of the GraphQL API to enable (`ENABLED`) or disable (`DISABLED`) introspection. If no value is provided, the introspection configuration will be set to ENABLED by default. This field will produce an error if the operation attempts to use the introspection feature while this field is disabled. For more information about introspection, see [GraphQL introspection](https://graphql.org/learn/introspection/).
     * 
     */
    @Export(name="introspectionConfig", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> introspectionConfig;

    /**
     * @return Sets the value of the GraphQL API to enable (`ENABLED`) or disable (`DISABLED`) introspection. If no value is provided, the introspection configuration will be set to ENABLED by default. This field will produce an error if the operation attempts to use the introspection feature while this field is disabled. For more information about introspection, see [GraphQL introspection](https://graphql.org/learn/introspection/).
     * 
     */
    public Output<Optional<String>> introspectionConfig() {
        return Codegen.optional(this.introspectionConfig);
    }
    /**
     * Nested argument containing Lambda authorizer configuration. Defined below.
     * 
     */
    @Export(name="lambdaAuthorizerConfig", refs={GraphQLApiLambdaAuthorizerConfig.class}, tree="[0]")
    private Output</* @Nullable */ GraphQLApiLambdaAuthorizerConfig> lambdaAuthorizerConfig;

    /**
     * @return Nested argument containing Lambda authorizer configuration. Defined below.
     * 
     */
    public Output<Optional<GraphQLApiLambdaAuthorizerConfig>> lambdaAuthorizerConfig() {
        return Codegen.optional(this.lambdaAuthorizerConfig);
    }
    /**
     * Nested argument containing logging configuration. Defined below.
     * 
     */
    @Export(name="logConfig", refs={GraphQLApiLogConfig.class}, tree="[0]")
    private Output</* @Nullable */ GraphQLApiLogConfig> logConfig;

    /**
     * @return Nested argument containing logging configuration. Defined below.
     * 
     */
    public Output<Optional<GraphQLApiLogConfig>> logConfig() {
        return Codegen.optional(this.logConfig);
    }
    /**
     * User-supplied name for the GraphqlApi.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return User-supplied name for the GraphqlApi.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Nested argument containing OpenID Connect configuration. Defined below.
     * 
     */
    @Export(name="openidConnectConfig", refs={GraphQLApiOpenidConnectConfig.class}, tree="[0]")
    private Output</* @Nullable */ GraphQLApiOpenidConnectConfig> openidConnectConfig;

    /**
     * @return Nested argument containing OpenID Connect configuration. Defined below.
     * 
     */
    public Output<Optional<GraphQLApiOpenidConnectConfig>> openidConnectConfig() {
        return Codegen.optional(this.openidConnectConfig);
    }
    /**
     * The maximum depth a query can have in a single request. Depth refers to the amount of nested levels allowed in the body of query. The default value is `0` (or unspecified), which indicates there&#39;s no depth limit. If you set a limit, it can be between `1` and `75` nested levels. This field will produce a limit error if the operation falls out of bounds.
     * 
     * Note that fields can still be set to nullable or non-nullable. If a non-nullable field produces an error, the error will be thrown upwards to the first nullable field available.
     * 
     */
    @Export(name="queryDepthLimit", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> queryDepthLimit;

    /**
     * @return The maximum depth a query can have in a single request. Depth refers to the amount of nested levels allowed in the body of query. The default value is `0` (or unspecified), which indicates there&#39;s no depth limit. If you set a limit, it can be between `1` and `75` nested levels. This field will produce a limit error if the operation falls out of bounds.
     * 
     * Note that fields can still be set to nullable or non-nullable. If a non-nullable field produces an error, the error will be thrown upwards to the first nullable field available.
     * 
     */
    public Output<Optional<Integer>> queryDepthLimit() {
        return Codegen.optional(this.queryDepthLimit);
    }
    /**
     * The maximum number of resolvers that can be invoked in a single request. The default value is `0` (or unspecified), which will set the limit to `10000`. When specified, the limit value can be between `1` and `10000`. This field will produce a limit error if the operation falls out of bounds.
     * 
     */
    @Export(name="resolverCountLimit", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> resolverCountLimit;

    /**
     * @return The maximum number of resolvers that can be invoked in a single request. The default value is `0` (or unspecified), which will set the limit to `10000`. When specified, the limit value can be between `1` and `10000`. This field will produce a limit error if the operation falls out of bounds.
     * 
     */
    public Output<Optional<Integer>> resolverCountLimit() {
        return Codegen.optional(this.resolverCountLimit);
    }
    /**
     * Schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> schema;

    /**
     * @return Schema definition, in GraphQL schema language format. This provider cannot perform drift detection of this configuration.
     * 
     */
    public Output<Optional<String>> schema() {
        return Codegen.optional(this.schema);
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Map of URIs associated with the APIE.g., `uris[&#34;GRAPHQL&#34;] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
     * 
     */
    @Export(name="uris", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> uris;

    /**
     * @return Map of URIs associated with the APIE.g., `uris[&#34;GRAPHQL&#34;] = https://ID.appsync-api.REGION.amazonaws.com/graphql`
     * 
     */
    public Output<Map<String,String>> uris() {
        return this.uris;
    }
    /**
     * Amazon Cognito User Pool configuration. Defined below.
     * 
     */
    @Export(name="userPoolConfig", refs={GraphQLApiUserPoolConfig.class}, tree="[0]")
    private Output</* @Nullable */ GraphQLApiUserPoolConfig> userPoolConfig;

    /**
     * @return Amazon Cognito User Pool configuration. Defined below.
     * 
     */
    public Output<Optional<GraphQLApiUserPoolConfig>> userPoolConfig() {
        return Codegen.optional(this.userPoolConfig);
    }
    /**
     * Sets the value of the GraphQL API to public (`GLOBAL`) or private (`PRIVATE`). If no value is provided, the visibility will be set to `GLOBAL` by default. This value cannot be changed once the API has been created.
     * 
     */
    @Export(name="visibility", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> visibility;

    /**
     * @return Sets the value of the GraphQL API to public (`GLOBAL`) or private (`PRIVATE`). If no value is provided, the visibility will be set to `GLOBAL` by default. This value cannot be changed once the API has been created.
     * 
     */
    public Output<Optional<String>> visibility() {
        return Codegen.optional(this.visibility);
    }
    /**
     * Whether tracing with X-ray is enabled. Defaults to false.
     * 
     */
    @Export(name="xrayEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> xrayEnabled;

    /**
     * @return Whether tracing with X-ray is enabled. Defaults to false.
     * 
     */
    public Output<Optional<Boolean>> xrayEnabled() {
        return Codegen.optional(this.xrayEnabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GraphQLApi(String name) {
        this(name, GraphQLApiArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GraphQLApi(String name, GraphQLApiArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GraphQLApi(String name, GraphQLApiArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/graphQLApi:GraphQLApi", name, args == null ? GraphQLApiArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GraphQLApi(String name, Output<String> id, @Nullable GraphQLApiState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/graphQLApi:GraphQLApi", name, state, makeResourceOptions(options, id));
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
    public static GraphQLApi get(String name, Output<String> id, @Nullable GraphQLApiState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GraphQLApi(name, id, state, options);
    }
}
