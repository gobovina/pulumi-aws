// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opensearch

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS OpenSearch Serverless Collection.
//
// > **NOTE:** An `opensearch.ServerlessCollection` cannot be created without having an applicable encryption security policy. Use the `dependsOn` meta-argument to define this dependency.
//
// > **NOTE:** An `opensearch.ServerlessCollection` is not accessible without configuring an applicable network security policy. Data cannot be accessed without configuring an applicable data access policy.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/opensearch"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"Rules": []map[string]interface{}{
//					map[string]interface{}{
//						"Resource": []string{
//							"collection/example",
//						},
//						"ResourceType": "collection",
//					},
//				},
//				"AWSOwnedKey": true,
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = opensearch.NewServerlessSecurityPolicy(ctx, "example", &opensearch.ServerlessSecurityPolicyArgs{
//				Name:   pulumi.String("example"),
//				Type:   pulumi.String("encryption"),
//				Policy: pulumi.String(json0),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = opensearch.NewServerlessCollection(ctx, "example", &opensearch.ServerlessCollectionArgs{
//				Name: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Using `pulumi import`, import OpenSearchServerless Collection using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:opensearch/serverlessCollection:ServerlessCollection example example
//
// ```
type ServerlessCollection struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) of the collection.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless collection.
	CollectionEndpoint pulumi.StringOutput `pulumi:"collectionEndpoint"`
	// Collection-specific endpoint used to access OpenSearch Dashboards.
	DashboardEndpoint pulumi.StringOutput `pulumi:"dashboardEndpoint"`
	// Description of the collection.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ARN of the Amazon Web Services KMS key used to encrypt the collection.
	KmsKeyArn pulumi.StringOutput `pulumi:"kmsKeyArn"`
	// Name of the collection.
	//
	// The following arguments are optional:
	Name pulumi.StringOutput `pulumi:"name"`
	// Indicates whether standby replicas should be used for a collection. One of `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
	StandbyReplicas pulumi.StringOutput `pulumi:"standbyReplicas"`
	// A map of tags to assign to the collection. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll  pulumi.StringMapOutput                `pulumi:"tagsAll"`
	Timeouts ServerlessCollectionTimeoutsPtrOutput `pulumi:"timeouts"`
	// Type of collection. One of `SEARCH`, `TIMESERIES`, or `VECTORSEARCH`. Defaults to `TIMESERIES`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewServerlessCollection registers a new resource with the given unique name, arguments, and options.
func NewServerlessCollection(ctx *pulumi.Context,
	name string, args *ServerlessCollectionArgs, opts ...pulumi.ResourceOption) (*ServerlessCollection, error) {
	if args == nil {
		args = &ServerlessCollectionArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServerlessCollection
	err := ctx.RegisterResource("aws:opensearch/serverlessCollection:ServerlessCollection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServerlessCollection gets an existing ServerlessCollection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServerlessCollection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServerlessCollectionState, opts ...pulumi.ResourceOption) (*ServerlessCollection, error) {
	var resource ServerlessCollection
	err := ctx.ReadResource("aws:opensearch/serverlessCollection:ServerlessCollection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServerlessCollection resources.
type serverlessCollectionState struct {
	// Amazon Resource Name (ARN) of the collection.
	Arn *string `pulumi:"arn"`
	// Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless collection.
	CollectionEndpoint *string `pulumi:"collectionEndpoint"`
	// Collection-specific endpoint used to access OpenSearch Dashboards.
	DashboardEndpoint *string `pulumi:"dashboardEndpoint"`
	// Description of the collection.
	Description *string `pulumi:"description"`
	// The ARN of the Amazon Web Services KMS key used to encrypt the collection.
	KmsKeyArn *string `pulumi:"kmsKeyArn"`
	// Name of the collection.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// Indicates whether standby replicas should be used for a collection. One of `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
	StandbyReplicas *string `pulumi:"standbyReplicas"`
	// A map of tags to assign to the collection. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll  map[string]string             `pulumi:"tagsAll"`
	Timeouts *ServerlessCollectionTimeouts `pulumi:"timeouts"`
	// Type of collection. One of `SEARCH`, `TIMESERIES`, or `VECTORSEARCH`. Defaults to `TIMESERIES`.
	Type *string `pulumi:"type"`
}

type ServerlessCollectionState struct {
	// Amazon Resource Name (ARN) of the collection.
	Arn pulumi.StringPtrInput
	// Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless collection.
	CollectionEndpoint pulumi.StringPtrInput
	// Collection-specific endpoint used to access OpenSearch Dashboards.
	DashboardEndpoint pulumi.StringPtrInput
	// Description of the collection.
	Description pulumi.StringPtrInput
	// The ARN of the Amazon Web Services KMS key used to encrypt the collection.
	KmsKeyArn pulumi.StringPtrInput
	// Name of the collection.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// Indicates whether standby replicas should be used for a collection. One of `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
	StandbyReplicas pulumi.StringPtrInput
	// A map of tags to assign to the collection. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Deprecated: Please use `tags` instead.
	TagsAll  pulumi.StringMapInput
	Timeouts ServerlessCollectionTimeoutsPtrInput
	// Type of collection. One of `SEARCH`, `TIMESERIES`, or `VECTORSEARCH`. Defaults to `TIMESERIES`.
	Type pulumi.StringPtrInput
}

func (ServerlessCollectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*serverlessCollectionState)(nil)).Elem()
}

type serverlessCollectionArgs struct {
	// Description of the collection.
	Description *string `pulumi:"description"`
	// Name of the collection.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// Indicates whether standby replicas should be used for a collection. One of `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
	StandbyReplicas *string `pulumi:"standbyReplicas"`
	// A map of tags to assign to the collection. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags     map[string]string             `pulumi:"tags"`
	Timeouts *ServerlessCollectionTimeouts `pulumi:"timeouts"`
	// Type of collection. One of `SEARCH`, `TIMESERIES`, or `VECTORSEARCH`. Defaults to `TIMESERIES`.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a ServerlessCollection resource.
type ServerlessCollectionArgs struct {
	// Description of the collection.
	Description pulumi.StringPtrInput
	// Name of the collection.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// Indicates whether standby replicas should be used for a collection. One of `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
	StandbyReplicas pulumi.StringPtrInput
	// A map of tags to assign to the collection. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags     pulumi.StringMapInput
	Timeouts ServerlessCollectionTimeoutsPtrInput
	// Type of collection. One of `SEARCH`, `TIMESERIES`, or `VECTORSEARCH`. Defaults to `TIMESERIES`.
	Type pulumi.StringPtrInput
}

func (ServerlessCollectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serverlessCollectionArgs)(nil)).Elem()
}

type ServerlessCollectionInput interface {
	pulumi.Input

	ToServerlessCollectionOutput() ServerlessCollectionOutput
	ToServerlessCollectionOutputWithContext(ctx context.Context) ServerlessCollectionOutput
}

func (*ServerlessCollection) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerlessCollection)(nil)).Elem()
}

func (i *ServerlessCollection) ToServerlessCollectionOutput() ServerlessCollectionOutput {
	return i.ToServerlessCollectionOutputWithContext(context.Background())
}

func (i *ServerlessCollection) ToServerlessCollectionOutputWithContext(ctx context.Context) ServerlessCollectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerlessCollectionOutput)
}

// ServerlessCollectionArrayInput is an input type that accepts ServerlessCollectionArray and ServerlessCollectionArrayOutput values.
// You can construct a concrete instance of `ServerlessCollectionArrayInput` via:
//
//	ServerlessCollectionArray{ ServerlessCollectionArgs{...} }
type ServerlessCollectionArrayInput interface {
	pulumi.Input

	ToServerlessCollectionArrayOutput() ServerlessCollectionArrayOutput
	ToServerlessCollectionArrayOutputWithContext(context.Context) ServerlessCollectionArrayOutput
}

type ServerlessCollectionArray []ServerlessCollectionInput

func (ServerlessCollectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerlessCollection)(nil)).Elem()
}

func (i ServerlessCollectionArray) ToServerlessCollectionArrayOutput() ServerlessCollectionArrayOutput {
	return i.ToServerlessCollectionArrayOutputWithContext(context.Background())
}

func (i ServerlessCollectionArray) ToServerlessCollectionArrayOutputWithContext(ctx context.Context) ServerlessCollectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerlessCollectionArrayOutput)
}

// ServerlessCollectionMapInput is an input type that accepts ServerlessCollectionMap and ServerlessCollectionMapOutput values.
// You can construct a concrete instance of `ServerlessCollectionMapInput` via:
//
//	ServerlessCollectionMap{ "key": ServerlessCollectionArgs{...} }
type ServerlessCollectionMapInput interface {
	pulumi.Input

	ToServerlessCollectionMapOutput() ServerlessCollectionMapOutput
	ToServerlessCollectionMapOutputWithContext(context.Context) ServerlessCollectionMapOutput
}

type ServerlessCollectionMap map[string]ServerlessCollectionInput

func (ServerlessCollectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerlessCollection)(nil)).Elem()
}

func (i ServerlessCollectionMap) ToServerlessCollectionMapOutput() ServerlessCollectionMapOutput {
	return i.ToServerlessCollectionMapOutputWithContext(context.Background())
}

func (i ServerlessCollectionMap) ToServerlessCollectionMapOutputWithContext(ctx context.Context) ServerlessCollectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerlessCollectionMapOutput)
}

type ServerlessCollectionOutput struct{ *pulumi.OutputState }

func (ServerlessCollectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerlessCollection)(nil)).Elem()
}

func (o ServerlessCollectionOutput) ToServerlessCollectionOutput() ServerlessCollectionOutput {
	return o
}

func (o ServerlessCollectionOutput) ToServerlessCollectionOutputWithContext(ctx context.Context) ServerlessCollectionOutput {
	return o
}

// Amazon Resource Name (ARN) of the collection.
func (o ServerlessCollectionOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCollection) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Collection-specific endpoint used to submit index, search, and data upload requests to an OpenSearch Serverless collection.
func (o ServerlessCollectionOutput) CollectionEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCollection) pulumi.StringOutput { return v.CollectionEndpoint }).(pulumi.StringOutput)
}

// Collection-specific endpoint used to access OpenSearch Dashboards.
func (o ServerlessCollectionOutput) DashboardEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCollection) pulumi.StringOutput { return v.DashboardEndpoint }).(pulumi.StringOutput)
}

// Description of the collection.
func (o ServerlessCollectionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerlessCollection) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ARN of the Amazon Web Services KMS key used to encrypt the collection.
func (o ServerlessCollectionOutput) KmsKeyArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCollection) pulumi.StringOutput { return v.KmsKeyArn }).(pulumi.StringOutput)
}

// Name of the collection.
//
// The following arguments are optional:
func (o ServerlessCollectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCollection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Indicates whether standby replicas should be used for a collection. One of `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
func (o ServerlessCollectionOutput) StandbyReplicas() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCollection) pulumi.StringOutput { return v.StandbyReplicas }).(pulumi.StringOutput)
}

// A map of tags to assign to the collection. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ServerlessCollectionOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ServerlessCollection) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Deprecated: Please use `tags` instead.
func (o ServerlessCollectionOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ServerlessCollection) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

func (o ServerlessCollectionOutput) Timeouts() ServerlessCollectionTimeoutsPtrOutput {
	return o.ApplyT(func(v *ServerlessCollection) ServerlessCollectionTimeoutsPtrOutput { return v.Timeouts }).(ServerlessCollectionTimeoutsPtrOutput)
}

// Type of collection. One of `SEARCH`, `TIMESERIES`, or `VECTORSEARCH`. Defaults to `TIMESERIES`.
func (o ServerlessCollectionOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerlessCollection) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type ServerlessCollectionArrayOutput struct{ *pulumi.OutputState }

func (ServerlessCollectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerlessCollection)(nil)).Elem()
}

func (o ServerlessCollectionArrayOutput) ToServerlessCollectionArrayOutput() ServerlessCollectionArrayOutput {
	return o
}

func (o ServerlessCollectionArrayOutput) ToServerlessCollectionArrayOutputWithContext(ctx context.Context) ServerlessCollectionArrayOutput {
	return o
}

func (o ServerlessCollectionArrayOutput) Index(i pulumi.IntInput) ServerlessCollectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServerlessCollection {
		return vs[0].([]*ServerlessCollection)[vs[1].(int)]
	}).(ServerlessCollectionOutput)
}

type ServerlessCollectionMapOutput struct{ *pulumi.OutputState }

func (ServerlessCollectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerlessCollection)(nil)).Elem()
}

func (o ServerlessCollectionMapOutput) ToServerlessCollectionMapOutput() ServerlessCollectionMapOutput {
	return o
}

func (o ServerlessCollectionMapOutput) ToServerlessCollectionMapOutputWithContext(ctx context.Context) ServerlessCollectionMapOutput {
	return o
}

func (o ServerlessCollectionMapOutput) MapIndex(k pulumi.StringInput) ServerlessCollectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServerlessCollection {
		return vs[0].(map[string]*ServerlessCollection)[vs[1].(string)]
	}).(ServerlessCollectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServerlessCollectionInput)(nil)).Elem(), &ServerlessCollection{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerlessCollectionArrayInput)(nil)).Elem(), ServerlessCollectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerlessCollectionMapInput)(nil)).Elem(), ServerlessCollectionMap{})
	pulumi.RegisterOutputType(ServerlessCollectionOutput{})
	pulumi.RegisterOutputType(ServerlessCollectionArrayOutput{})
	pulumi.RegisterOutputType(ServerlessCollectionMapOutput{})
}
