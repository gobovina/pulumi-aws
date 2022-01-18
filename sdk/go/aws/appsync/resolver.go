// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package appsync

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AppSync Resolver.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/appsync"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		testGraphQLApi, err := appsync.NewGraphQLApi(ctx, "testGraphQLApi", &appsync.GraphQLApiArgs{
// 			AuthenticationType: pulumi.String("API_KEY"),
// 			Schema: pulumi.String(fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v", "type Mutation {\n", "	putPost(id: ID!, title: String!): Post\n", "}\n", "\n", "type Post {\n", "	id: ID!\n", "	title: String!\n", "}\n", "\n", "type Query {\n", "	singlePost(id: ID!): Post\n", "}\n", "\n", "schema {\n", "	query: Query\n", "	mutation: Mutation\n", "}\n")),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		testDataSource, err := appsync.NewDataSource(ctx, "testDataSource", &appsync.DataSourceArgs{
// 			ApiId: testGraphQLApi.ID(),
// 			Name:  pulumi.String("tf_example"),
// 			Type:  pulumi.String("HTTP"),
// 			HttpConfig: &appsync.DataSourceHttpConfigArgs{
// 				Endpoint: pulumi.String("http://example.com"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = appsync.NewResolver(ctx, "testResolver", &appsync.ResolverArgs{
// 			ApiId:            testGraphQLApi.ID(),
// 			Field:            pulumi.String("singlePost"),
// 			Type:             pulumi.String("Query"),
// 			DataSource:       testDataSource.Name,
// 			RequestTemplate:  pulumi.String(fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v", "{\n", "    \"version\": \"2018-05-29\",\n", "    \"method\": \"GET\",\n", "    \"resourcePath\": \"/\",\n", "    \"params\":{\n", "        \"headers\": ", "$", "utils.http.copyheaders(", "$", "ctx.request.headers)\n", "    }\n", "}\n")),
// 			ResponseTemplate: pulumi.String(fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v", "#if(", "$", "ctx.result.statusCode == 200)\n", "    ", "$", "ctx.result.body\n", "#else\n", "    ", "$", "utils.appendError(", "$", "ctx.result.body, ", "$", "ctx.result.statusCode)\n", "#end\n")),
// 			CachingConfig: &appsync.ResolverCachingConfigArgs{
// 				CachingKeys: pulumi.StringArray{
// 					pulumi.String(fmt.Sprintf("%v%v", "$", "context.identity.sub")),
// 					pulumi.String(fmt.Sprintf("%v%v", "$", "context.arguments.id")),
// 				},
// 				Ttl: pulumi.Int(60),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = appsync.NewResolver(ctx, "mutationPipelineTest", &appsync.ResolverArgs{
// 			Type:             pulumi.String("Mutation"),
// 			ApiId:            testGraphQLApi.ID(),
// 			Field:            pulumi.String("pipelineTest"),
// 			RequestTemplate:  pulumi.String("{}"),
// 			ResponseTemplate: pulumi.String(fmt.Sprintf("%v%v%v%v", "$", "util.toJson(", "$", "ctx.result)")),
// 			Kind:             pulumi.String("PIPELINE"),
// 			PipelineConfig: &appsync.ResolverPipelineConfigArgs{
// 				Functions: pulumi.StringArray{
// 					pulumi.Any(aws_appsync_function.Test1.Function_id),
// 					pulumi.Any(aws_appsync_function.Test2.Function_id),
// 					pulumi.Any(aws_appsync_function.Test3.Function_id),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// `aws_appsync_resolver` can be imported with their `api_id`, a hyphen, `type`, a hypen and `field` e.g.,
//
// ```sh
//  $ pulumi import aws:appsync/resolver:Resolver example abcdef123456-exampleType-exampleField
// ```
type Resolver struct {
	pulumi.CustomResourceState

	// The API ID for the GraphQL API.
	ApiId pulumi.StringOutput `pulumi:"apiId"`
	// The ARN
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The CachingConfig.
	CachingConfig ResolverCachingConfigPtrOutput `pulumi:"cachingConfig"`
	// The DataSource name.
	DataSource pulumi.StringPtrOutput `pulumi:"dataSource"`
	// The field name from the schema defined in the GraphQL API.
	Field pulumi.StringOutput `pulumi:"field"`
	// The resolver type. Valid values are `UNIT` and `PIPELINE`.
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// The maximum batching size for a resolver. Valid values are between `0` and `2000`.
	MaxBatchSize pulumi.IntPtrOutput `pulumi:"maxBatchSize"`
	// The PipelineConfig.
	PipelineConfig ResolverPipelineConfigPtrOutput `pulumi:"pipelineConfig"`
	// The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
	RequestTemplate pulumi.StringPtrOutput `pulumi:"requestTemplate"`
	// The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
	ResponseTemplate pulumi.StringPtrOutput `pulumi:"responseTemplate"`
	// Describes a Sync configuration for a resolver. See Sync Config.
	SyncConfig ResolverSyncConfigPtrOutput `pulumi:"syncConfig"`
	// The type name from the schema defined in the GraphQL API.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewResolver registers a new resource with the given unique name, arguments, and options.
func NewResolver(ctx *pulumi.Context,
	name string, args *ResolverArgs, opts ...pulumi.ResourceOption) (*Resolver, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiId == nil {
		return nil, errors.New("invalid value for required argument 'ApiId'")
	}
	if args.Field == nil {
		return nil, errors.New("invalid value for required argument 'Field'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource Resolver
	err := ctx.RegisterResource("aws:appsync/resolver:Resolver", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResolver gets an existing Resolver resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResolver(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResolverState, opts ...pulumi.ResourceOption) (*Resolver, error) {
	var resource Resolver
	err := ctx.ReadResource("aws:appsync/resolver:Resolver", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Resolver resources.
type resolverState struct {
	// The API ID for the GraphQL API.
	ApiId *string `pulumi:"apiId"`
	// The ARN
	Arn *string `pulumi:"arn"`
	// The CachingConfig.
	CachingConfig *ResolverCachingConfig `pulumi:"cachingConfig"`
	// The DataSource name.
	DataSource *string `pulumi:"dataSource"`
	// The field name from the schema defined in the GraphQL API.
	Field *string `pulumi:"field"`
	// The resolver type. Valid values are `UNIT` and `PIPELINE`.
	Kind *string `pulumi:"kind"`
	// The maximum batching size for a resolver. Valid values are between `0` and `2000`.
	MaxBatchSize *int `pulumi:"maxBatchSize"`
	// The PipelineConfig.
	PipelineConfig *ResolverPipelineConfig `pulumi:"pipelineConfig"`
	// The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
	RequestTemplate *string `pulumi:"requestTemplate"`
	// The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
	ResponseTemplate *string `pulumi:"responseTemplate"`
	// Describes a Sync configuration for a resolver. See Sync Config.
	SyncConfig *ResolverSyncConfig `pulumi:"syncConfig"`
	// The type name from the schema defined in the GraphQL API.
	Type *string `pulumi:"type"`
}

type ResolverState struct {
	// The API ID for the GraphQL API.
	ApiId pulumi.StringPtrInput
	// The ARN
	Arn pulumi.StringPtrInput
	// The CachingConfig.
	CachingConfig ResolverCachingConfigPtrInput
	// The DataSource name.
	DataSource pulumi.StringPtrInput
	// The field name from the schema defined in the GraphQL API.
	Field pulumi.StringPtrInput
	// The resolver type. Valid values are `UNIT` and `PIPELINE`.
	Kind pulumi.StringPtrInput
	// The maximum batching size for a resolver. Valid values are between `0` and `2000`.
	MaxBatchSize pulumi.IntPtrInput
	// The PipelineConfig.
	PipelineConfig ResolverPipelineConfigPtrInput
	// The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
	RequestTemplate pulumi.StringPtrInput
	// The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
	ResponseTemplate pulumi.StringPtrInput
	// Describes a Sync configuration for a resolver. See Sync Config.
	SyncConfig ResolverSyncConfigPtrInput
	// The type name from the schema defined in the GraphQL API.
	Type pulumi.StringPtrInput
}

func (ResolverState) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverState)(nil)).Elem()
}

type resolverArgs struct {
	// The API ID for the GraphQL API.
	ApiId string `pulumi:"apiId"`
	// The CachingConfig.
	CachingConfig *ResolverCachingConfig `pulumi:"cachingConfig"`
	// The DataSource name.
	DataSource *string `pulumi:"dataSource"`
	// The field name from the schema defined in the GraphQL API.
	Field string `pulumi:"field"`
	// The resolver type. Valid values are `UNIT` and `PIPELINE`.
	Kind *string `pulumi:"kind"`
	// The maximum batching size for a resolver. Valid values are between `0` and `2000`.
	MaxBatchSize *int `pulumi:"maxBatchSize"`
	// The PipelineConfig.
	PipelineConfig *ResolverPipelineConfig `pulumi:"pipelineConfig"`
	// The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
	RequestTemplate *string `pulumi:"requestTemplate"`
	// The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
	ResponseTemplate *string `pulumi:"responseTemplate"`
	// Describes a Sync configuration for a resolver. See Sync Config.
	SyncConfig *ResolverSyncConfig `pulumi:"syncConfig"`
	// The type name from the schema defined in the GraphQL API.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a Resolver resource.
type ResolverArgs struct {
	// The API ID for the GraphQL API.
	ApiId pulumi.StringInput
	// The CachingConfig.
	CachingConfig ResolverCachingConfigPtrInput
	// The DataSource name.
	DataSource pulumi.StringPtrInput
	// The field name from the schema defined in the GraphQL API.
	Field pulumi.StringInput
	// The resolver type. Valid values are `UNIT` and `PIPELINE`.
	Kind pulumi.StringPtrInput
	// The maximum batching size for a resolver. Valid values are between `0` and `2000`.
	MaxBatchSize pulumi.IntPtrInput
	// The PipelineConfig.
	PipelineConfig ResolverPipelineConfigPtrInput
	// The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
	RequestTemplate pulumi.StringPtrInput
	// The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
	ResponseTemplate pulumi.StringPtrInput
	// Describes a Sync configuration for a resolver. See Sync Config.
	SyncConfig ResolverSyncConfigPtrInput
	// The type name from the schema defined in the GraphQL API.
	Type pulumi.StringInput
}

func (ResolverArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resolverArgs)(nil)).Elem()
}

type ResolverInput interface {
	pulumi.Input

	ToResolverOutput() ResolverOutput
	ToResolverOutputWithContext(ctx context.Context) ResolverOutput
}

func (*Resolver) ElementType() reflect.Type {
	return reflect.TypeOf((*Resolver)(nil))
}

func (i *Resolver) ToResolverOutput() ResolverOutput {
	return i.ToResolverOutputWithContext(context.Background())
}

func (i *Resolver) ToResolverOutputWithContext(ctx context.Context) ResolverOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverOutput)
}

func (i *Resolver) ToResolverPtrOutput() ResolverPtrOutput {
	return i.ToResolverPtrOutputWithContext(context.Background())
}

func (i *Resolver) ToResolverPtrOutputWithContext(ctx context.Context) ResolverPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverPtrOutput)
}

type ResolverPtrInput interface {
	pulumi.Input

	ToResolverPtrOutput() ResolverPtrOutput
	ToResolverPtrOutputWithContext(ctx context.Context) ResolverPtrOutput
}

type resolverPtrType ResolverArgs

func (*resolverPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Resolver)(nil))
}

func (i *resolverPtrType) ToResolverPtrOutput() ResolverPtrOutput {
	return i.ToResolverPtrOutputWithContext(context.Background())
}

func (i *resolverPtrType) ToResolverPtrOutputWithContext(ctx context.Context) ResolverPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverPtrOutput)
}

// ResolverArrayInput is an input type that accepts ResolverArray and ResolverArrayOutput values.
// You can construct a concrete instance of `ResolverArrayInput` via:
//
//          ResolverArray{ ResolverArgs{...} }
type ResolverArrayInput interface {
	pulumi.Input

	ToResolverArrayOutput() ResolverArrayOutput
	ToResolverArrayOutputWithContext(context.Context) ResolverArrayOutput
}

type ResolverArray []ResolverInput

func (ResolverArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Resolver)(nil)).Elem()
}

func (i ResolverArray) ToResolverArrayOutput() ResolverArrayOutput {
	return i.ToResolverArrayOutputWithContext(context.Background())
}

func (i ResolverArray) ToResolverArrayOutputWithContext(ctx context.Context) ResolverArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverArrayOutput)
}

// ResolverMapInput is an input type that accepts ResolverMap and ResolverMapOutput values.
// You can construct a concrete instance of `ResolverMapInput` via:
//
//          ResolverMap{ "key": ResolverArgs{...} }
type ResolverMapInput interface {
	pulumi.Input

	ToResolverMapOutput() ResolverMapOutput
	ToResolverMapOutputWithContext(context.Context) ResolverMapOutput
}

type ResolverMap map[string]ResolverInput

func (ResolverMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Resolver)(nil)).Elem()
}

func (i ResolverMap) ToResolverMapOutput() ResolverMapOutput {
	return i.ToResolverMapOutputWithContext(context.Background())
}

func (i ResolverMap) ToResolverMapOutputWithContext(ctx context.Context) ResolverMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResolverMapOutput)
}

type ResolverOutput struct{ *pulumi.OutputState }

func (ResolverOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Resolver)(nil))
}

func (o ResolverOutput) ToResolverOutput() ResolverOutput {
	return o
}

func (o ResolverOutput) ToResolverOutputWithContext(ctx context.Context) ResolverOutput {
	return o
}

func (o ResolverOutput) ToResolverPtrOutput() ResolverPtrOutput {
	return o.ToResolverPtrOutputWithContext(context.Background())
}

func (o ResolverOutput) ToResolverPtrOutputWithContext(ctx context.Context) ResolverPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Resolver) *Resolver {
		return &v
	}).(ResolverPtrOutput)
}

type ResolverPtrOutput struct{ *pulumi.OutputState }

func (ResolverPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Resolver)(nil))
}

func (o ResolverPtrOutput) ToResolverPtrOutput() ResolverPtrOutput {
	return o
}

func (o ResolverPtrOutput) ToResolverPtrOutputWithContext(ctx context.Context) ResolverPtrOutput {
	return o
}

func (o ResolverPtrOutput) Elem() ResolverOutput {
	return o.ApplyT(func(v *Resolver) Resolver {
		if v != nil {
			return *v
		}
		var ret Resolver
		return ret
	}).(ResolverOutput)
}

type ResolverArrayOutput struct{ *pulumi.OutputState }

func (ResolverArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Resolver)(nil))
}

func (o ResolverArrayOutput) ToResolverArrayOutput() ResolverArrayOutput {
	return o
}

func (o ResolverArrayOutput) ToResolverArrayOutputWithContext(ctx context.Context) ResolverArrayOutput {
	return o
}

func (o ResolverArrayOutput) Index(i pulumi.IntInput) ResolverOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Resolver {
		return vs[0].([]Resolver)[vs[1].(int)]
	}).(ResolverOutput)
}

type ResolverMapOutput struct{ *pulumi.OutputState }

func (ResolverMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Resolver)(nil))
}

func (o ResolverMapOutput) ToResolverMapOutput() ResolverMapOutput {
	return o
}

func (o ResolverMapOutput) ToResolverMapOutputWithContext(ctx context.Context) ResolverMapOutput {
	return o
}

func (o ResolverMapOutput) MapIndex(k pulumi.StringInput) ResolverOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Resolver {
		return vs[0].(map[string]Resolver)[vs[1].(string)]
	}).(ResolverOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverInput)(nil)).Elem(), &Resolver{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverPtrInput)(nil)).Elem(), &Resolver{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverArrayInput)(nil)).Elem(), ResolverArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResolverMapInput)(nil)).Elem(), ResolverMap{})
	pulumi.RegisterOutputType(ResolverOutput{})
	pulumi.RegisterOutputType(ResolverPtrOutput{})
	pulumi.RegisterOutputType(ResolverArrayOutput{})
	pulumi.RegisterOutputType(ResolverMapOutput{})
}
