// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package neptune

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Neptune Cluster Endpoint Resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/neptune"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := neptune.NewClusterEndpoint(ctx, "example", &neptune.ClusterEndpointArgs{
//				ClusterIdentifier:         pulumi.Any(aws_neptune_cluster.Test.Cluster_identifier),
//				ClusterEndpointIdentifier: pulumi.String("example"),
//				EndpointType:              pulumi.String("READER"),
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
// Using `pulumi import`, import `aws_neptune_cluster_endpoint` using the `cluster-identifier:endpoint-identfier`. For example:
//
// ```sh
//
//	$ pulumi import aws:neptune/clusterEndpoint:ClusterEndpoint example my-cluster:my-endpoint
//
// ```
type ClusterEndpoint struct {
	pulumi.CustomResourceState

	// The Neptune Cluster Endpoint Amazon Resource Name (ARN).
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The identifier of the endpoint.
	ClusterEndpointIdentifier pulumi.StringOutput `pulumi:"clusterEndpointIdentifier"`
	// The DB cluster identifier of the DB cluster associated with the endpoint.
	ClusterIdentifier pulumi.StringOutput `pulumi:"clusterIdentifier"`
	// The DNS address of the endpoint.
	Endpoint pulumi.StringOutput `pulumi:"endpoint"`
	// The type of the endpoint. One of: `READER`, `WRITER`, `ANY`.
	EndpointType pulumi.StringOutput `pulumi:"endpointType"`
	// List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
	ExcludedMembers pulumi.StringArrayOutput `pulumi:"excludedMembers"`
	// List of DB instance identifiers that are part of the custom endpoint group.
	StaticMembers pulumi.StringArrayOutput `pulumi:"staticMembers"`
	// A map of tags to assign to the Neptune cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewClusterEndpoint registers a new resource with the given unique name, arguments, and options.
func NewClusterEndpoint(ctx *pulumi.Context,
	name string, args *ClusterEndpointArgs, opts ...pulumi.ResourceOption) (*ClusterEndpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterEndpointIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'ClusterEndpointIdentifier'")
	}
	if args.ClusterIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'ClusterIdentifier'")
	}
	if args.EndpointType == nil {
		return nil, errors.New("invalid value for required argument 'EndpointType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ClusterEndpoint
	err := ctx.RegisterResource("aws:neptune/clusterEndpoint:ClusterEndpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterEndpoint gets an existing ClusterEndpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterEndpointState, opts ...pulumi.ResourceOption) (*ClusterEndpoint, error) {
	var resource ClusterEndpoint
	err := ctx.ReadResource("aws:neptune/clusterEndpoint:ClusterEndpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterEndpoint resources.
type clusterEndpointState struct {
	// The Neptune Cluster Endpoint Amazon Resource Name (ARN).
	Arn *string `pulumi:"arn"`
	// The identifier of the endpoint.
	ClusterEndpointIdentifier *string `pulumi:"clusterEndpointIdentifier"`
	// The DB cluster identifier of the DB cluster associated with the endpoint.
	ClusterIdentifier *string `pulumi:"clusterIdentifier"`
	// The DNS address of the endpoint.
	Endpoint *string `pulumi:"endpoint"`
	// The type of the endpoint. One of: `READER`, `WRITER`, `ANY`.
	EndpointType *string `pulumi:"endpointType"`
	// List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
	ExcludedMembers []string `pulumi:"excludedMembers"`
	// List of DB instance identifiers that are part of the custom endpoint group.
	StaticMembers []string `pulumi:"staticMembers"`
	// A map of tags to assign to the Neptune cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ClusterEndpointState struct {
	// The Neptune Cluster Endpoint Amazon Resource Name (ARN).
	Arn pulumi.StringPtrInput
	// The identifier of the endpoint.
	ClusterEndpointIdentifier pulumi.StringPtrInput
	// The DB cluster identifier of the DB cluster associated with the endpoint.
	ClusterIdentifier pulumi.StringPtrInput
	// The DNS address of the endpoint.
	Endpoint pulumi.StringPtrInput
	// The type of the endpoint. One of: `READER`, `WRITER`, `ANY`.
	EndpointType pulumi.StringPtrInput
	// List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
	ExcludedMembers pulumi.StringArrayInput
	// List of DB instance identifiers that are part of the custom endpoint group.
	StaticMembers pulumi.StringArrayInput
	// A map of tags to assign to the Neptune cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (ClusterEndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterEndpointState)(nil)).Elem()
}

type clusterEndpointArgs struct {
	// The identifier of the endpoint.
	ClusterEndpointIdentifier string `pulumi:"clusterEndpointIdentifier"`
	// The DB cluster identifier of the DB cluster associated with the endpoint.
	ClusterIdentifier string `pulumi:"clusterIdentifier"`
	// The type of the endpoint. One of: `READER`, `WRITER`, `ANY`.
	EndpointType string `pulumi:"endpointType"`
	// List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
	ExcludedMembers []string `pulumi:"excludedMembers"`
	// List of DB instance identifiers that are part of the custom endpoint group.
	StaticMembers []string `pulumi:"staticMembers"`
	// A map of tags to assign to the Neptune cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ClusterEndpoint resource.
type ClusterEndpointArgs struct {
	// The identifier of the endpoint.
	ClusterEndpointIdentifier pulumi.StringInput
	// The DB cluster identifier of the DB cluster associated with the endpoint.
	ClusterIdentifier pulumi.StringInput
	// The type of the endpoint. One of: `READER`, `WRITER`, `ANY`.
	EndpointType pulumi.StringInput
	// List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
	ExcludedMembers pulumi.StringArrayInput
	// List of DB instance identifiers that are part of the custom endpoint group.
	StaticMembers pulumi.StringArrayInput
	// A map of tags to assign to the Neptune cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ClusterEndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterEndpointArgs)(nil)).Elem()
}

type ClusterEndpointInput interface {
	pulumi.Input

	ToClusterEndpointOutput() ClusterEndpointOutput
	ToClusterEndpointOutputWithContext(ctx context.Context) ClusterEndpointOutput
}

func (*ClusterEndpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterEndpoint)(nil)).Elem()
}

func (i *ClusterEndpoint) ToClusterEndpointOutput() ClusterEndpointOutput {
	return i.ToClusterEndpointOutputWithContext(context.Background())
}

func (i *ClusterEndpoint) ToClusterEndpointOutputWithContext(ctx context.Context) ClusterEndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterEndpointOutput)
}

// ClusterEndpointArrayInput is an input type that accepts ClusterEndpointArray and ClusterEndpointArrayOutput values.
// You can construct a concrete instance of `ClusterEndpointArrayInput` via:
//
//	ClusterEndpointArray{ ClusterEndpointArgs{...} }
type ClusterEndpointArrayInput interface {
	pulumi.Input

	ToClusterEndpointArrayOutput() ClusterEndpointArrayOutput
	ToClusterEndpointArrayOutputWithContext(context.Context) ClusterEndpointArrayOutput
}

type ClusterEndpointArray []ClusterEndpointInput

func (ClusterEndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterEndpoint)(nil)).Elem()
}

func (i ClusterEndpointArray) ToClusterEndpointArrayOutput() ClusterEndpointArrayOutput {
	return i.ToClusterEndpointArrayOutputWithContext(context.Background())
}

func (i ClusterEndpointArray) ToClusterEndpointArrayOutputWithContext(ctx context.Context) ClusterEndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterEndpointArrayOutput)
}

// ClusterEndpointMapInput is an input type that accepts ClusterEndpointMap and ClusterEndpointMapOutput values.
// You can construct a concrete instance of `ClusterEndpointMapInput` via:
//
//	ClusterEndpointMap{ "key": ClusterEndpointArgs{...} }
type ClusterEndpointMapInput interface {
	pulumi.Input

	ToClusterEndpointMapOutput() ClusterEndpointMapOutput
	ToClusterEndpointMapOutputWithContext(context.Context) ClusterEndpointMapOutput
}

type ClusterEndpointMap map[string]ClusterEndpointInput

func (ClusterEndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterEndpoint)(nil)).Elem()
}

func (i ClusterEndpointMap) ToClusterEndpointMapOutput() ClusterEndpointMapOutput {
	return i.ToClusterEndpointMapOutputWithContext(context.Background())
}

func (i ClusterEndpointMap) ToClusterEndpointMapOutputWithContext(ctx context.Context) ClusterEndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterEndpointMapOutput)
}

type ClusterEndpointOutput struct{ *pulumi.OutputState }

func (ClusterEndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterEndpoint)(nil)).Elem()
}

func (o ClusterEndpointOutput) ToClusterEndpointOutput() ClusterEndpointOutput {
	return o
}

func (o ClusterEndpointOutput) ToClusterEndpointOutputWithContext(ctx context.Context) ClusterEndpointOutput {
	return o
}

// The Neptune Cluster Endpoint Amazon Resource Name (ARN).
func (o ClusterEndpointOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterEndpoint) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The identifier of the endpoint.
func (o ClusterEndpointOutput) ClusterEndpointIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterEndpoint) pulumi.StringOutput { return v.ClusterEndpointIdentifier }).(pulumi.StringOutput)
}

// The DB cluster identifier of the DB cluster associated with the endpoint.
func (o ClusterEndpointOutput) ClusterIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterEndpoint) pulumi.StringOutput { return v.ClusterIdentifier }).(pulumi.StringOutput)
}

// The DNS address of the endpoint.
func (o ClusterEndpointOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterEndpoint) pulumi.StringOutput { return v.Endpoint }).(pulumi.StringOutput)
}

// The type of the endpoint. One of: `READER`, `WRITER`, `ANY`.
func (o ClusterEndpointOutput) EndpointType() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterEndpoint) pulumi.StringOutput { return v.EndpointType }).(pulumi.StringOutput)
}

// List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
func (o ClusterEndpointOutput) ExcludedMembers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ClusterEndpoint) pulumi.StringArrayOutput { return v.ExcludedMembers }).(pulumi.StringArrayOutput)
}

// List of DB instance identifiers that are part of the custom endpoint group.
func (o ClusterEndpointOutput) StaticMembers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ClusterEndpoint) pulumi.StringArrayOutput { return v.StaticMembers }).(pulumi.StringArrayOutput)
}

// A map of tags to assign to the Neptune cluster. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ClusterEndpointOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ClusterEndpoint) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ClusterEndpointOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ClusterEndpoint) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ClusterEndpointArrayOutput struct{ *pulumi.OutputState }

func (ClusterEndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterEndpoint)(nil)).Elem()
}

func (o ClusterEndpointArrayOutput) ToClusterEndpointArrayOutput() ClusterEndpointArrayOutput {
	return o
}

func (o ClusterEndpointArrayOutput) ToClusterEndpointArrayOutputWithContext(ctx context.Context) ClusterEndpointArrayOutput {
	return o
}

func (o ClusterEndpointArrayOutput) Index(i pulumi.IntInput) ClusterEndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterEndpoint {
		return vs[0].([]*ClusterEndpoint)[vs[1].(int)]
	}).(ClusterEndpointOutput)
}

type ClusterEndpointMapOutput struct{ *pulumi.OutputState }

func (ClusterEndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterEndpoint)(nil)).Elem()
}

func (o ClusterEndpointMapOutput) ToClusterEndpointMapOutput() ClusterEndpointMapOutput {
	return o
}

func (o ClusterEndpointMapOutput) ToClusterEndpointMapOutputWithContext(ctx context.Context) ClusterEndpointMapOutput {
	return o
}

func (o ClusterEndpointMapOutput) MapIndex(k pulumi.StringInput) ClusterEndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterEndpoint {
		return vs[0].(map[string]*ClusterEndpoint)[vs[1].(string)]
	}).(ClusterEndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterEndpointInput)(nil)).Elem(), &ClusterEndpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterEndpointArrayInput)(nil)).Elem(), ClusterEndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterEndpointMapInput)(nil)).Elem(), ClusterEndpointMap{})
	pulumi.RegisterOutputType(ClusterEndpointOutput{})
	pulumi.RegisterOutputType(ClusterEndpointArrayOutput{})
	pulumi.RegisterOutputType(ClusterEndpointMapOutput{})
}
