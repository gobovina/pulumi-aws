// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package location

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Location Service Place Index.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/location"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := location.NewPlaceIndex(ctx, "example", &location.PlaceIndexArgs{
//				DataSource: pulumi.String("Here"),
//				IndexName:  pulumi.String("example"),
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
// Using `pulumi import`, import `aws_location_place_index` resources using the place index name. For example:
//
// ```sh
//
//	$ pulumi import aws:location/placeIndex:PlaceIndex example example
//
// ```
type PlaceIndex struct {
	pulumi.CustomResourceState

	// The timestamp for when the place index resource was created in ISO 8601 format.
	CreateTime pulumi.StringOutput `pulumi:"createTime"`
	// Specifies the geospatial data provider for the new place index.
	DataSource pulumi.StringOutput `pulumi:"dataSource"`
	// Configuration block with the data storage option chosen for requesting Places. Detailed below.
	DataSourceConfiguration PlaceIndexDataSourceConfigurationOutput `pulumi:"dataSourceConfiguration"`
	// The optional description for the place index resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The Amazon Resource Name (ARN) for the place index resource. Used to specify a resource across AWS.
	IndexArn pulumi.StringOutput `pulumi:"indexArn"`
	// The name of the place index resource.
	//
	// The following arguments are optional:
	IndexName pulumi.StringOutput `pulumi:"indexName"`
	// Key-value tags for the place index. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The timestamp for when the place index resource was last update in ISO 8601.
	UpdateTime pulumi.StringOutput `pulumi:"updateTime"`
}

// NewPlaceIndex registers a new resource with the given unique name, arguments, and options.
func NewPlaceIndex(ctx *pulumi.Context,
	name string, args *PlaceIndexArgs, opts ...pulumi.ResourceOption) (*PlaceIndex, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataSource == nil {
		return nil, errors.New("invalid value for required argument 'DataSource'")
	}
	if args.IndexName == nil {
		return nil, errors.New("invalid value for required argument 'IndexName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PlaceIndex
	err := ctx.RegisterResource("aws:location/placeIndex:PlaceIndex", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPlaceIndex gets an existing PlaceIndex resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPlaceIndex(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PlaceIndexState, opts ...pulumi.ResourceOption) (*PlaceIndex, error) {
	var resource PlaceIndex
	err := ctx.ReadResource("aws:location/placeIndex:PlaceIndex", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PlaceIndex resources.
type placeIndexState struct {
	// The timestamp for when the place index resource was created in ISO 8601 format.
	CreateTime *string `pulumi:"createTime"`
	// Specifies the geospatial data provider for the new place index.
	DataSource *string `pulumi:"dataSource"`
	// Configuration block with the data storage option chosen for requesting Places. Detailed below.
	DataSourceConfiguration *PlaceIndexDataSourceConfiguration `pulumi:"dataSourceConfiguration"`
	// The optional description for the place index resource.
	Description *string `pulumi:"description"`
	// The Amazon Resource Name (ARN) for the place index resource. Used to specify a resource across AWS.
	IndexArn *string `pulumi:"indexArn"`
	// The name of the place index resource.
	//
	// The following arguments are optional:
	IndexName *string `pulumi:"indexName"`
	// Key-value tags for the place index. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The timestamp for when the place index resource was last update in ISO 8601.
	UpdateTime *string `pulumi:"updateTime"`
}

type PlaceIndexState struct {
	// The timestamp for when the place index resource was created in ISO 8601 format.
	CreateTime pulumi.StringPtrInput
	// Specifies the geospatial data provider for the new place index.
	DataSource pulumi.StringPtrInput
	// Configuration block with the data storage option chosen for requesting Places. Detailed below.
	DataSourceConfiguration PlaceIndexDataSourceConfigurationPtrInput
	// The optional description for the place index resource.
	Description pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) for the place index resource. Used to specify a resource across AWS.
	IndexArn pulumi.StringPtrInput
	// The name of the place index resource.
	//
	// The following arguments are optional:
	IndexName pulumi.StringPtrInput
	// Key-value tags for the place index. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The timestamp for when the place index resource was last update in ISO 8601.
	UpdateTime pulumi.StringPtrInput
}

func (PlaceIndexState) ElementType() reflect.Type {
	return reflect.TypeOf((*placeIndexState)(nil)).Elem()
}

type placeIndexArgs struct {
	// Specifies the geospatial data provider for the new place index.
	DataSource string `pulumi:"dataSource"`
	// Configuration block with the data storage option chosen for requesting Places. Detailed below.
	DataSourceConfiguration *PlaceIndexDataSourceConfiguration `pulumi:"dataSourceConfiguration"`
	// The optional description for the place index resource.
	Description *string `pulumi:"description"`
	// The name of the place index resource.
	//
	// The following arguments are optional:
	IndexName string `pulumi:"indexName"`
	// Key-value tags for the place index. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a PlaceIndex resource.
type PlaceIndexArgs struct {
	// Specifies the geospatial data provider for the new place index.
	DataSource pulumi.StringInput
	// Configuration block with the data storage option chosen for requesting Places. Detailed below.
	DataSourceConfiguration PlaceIndexDataSourceConfigurationPtrInput
	// The optional description for the place index resource.
	Description pulumi.StringPtrInput
	// The name of the place index resource.
	//
	// The following arguments are optional:
	IndexName pulumi.StringInput
	// Key-value tags for the place index. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (PlaceIndexArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*placeIndexArgs)(nil)).Elem()
}

type PlaceIndexInput interface {
	pulumi.Input

	ToPlaceIndexOutput() PlaceIndexOutput
	ToPlaceIndexOutputWithContext(ctx context.Context) PlaceIndexOutput
}

func (*PlaceIndex) ElementType() reflect.Type {
	return reflect.TypeOf((**PlaceIndex)(nil)).Elem()
}

func (i *PlaceIndex) ToPlaceIndexOutput() PlaceIndexOutput {
	return i.ToPlaceIndexOutputWithContext(context.Background())
}

func (i *PlaceIndex) ToPlaceIndexOutputWithContext(ctx context.Context) PlaceIndexOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlaceIndexOutput)
}

// PlaceIndexArrayInput is an input type that accepts PlaceIndexArray and PlaceIndexArrayOutput values.
// You can construct a concrete instance of `PlaceIndexArrayInput` via:
//
//	PlaceIndexArray{ PlaceIndexArgs{...} }
type PlaceIndexArrayInput interface {
	pulumi.Input

	ToPlaceIndexArrayOutput() PlaceIndexArrayOutput
	ToPlaceIndexArrayOutputWithContext(context.Context) PlaceIndexArrayOutput
}

type PlaceIndexArray []PlaceIndexInput

func (PlaceIndexArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PlaceIndex)(nil)).Elem()
}

func (i PlaceIndexArray) ToPlaceIndexArrayOutput() PlaceIndexArrayOutput {
	return i.ToPlaceIndexArrayOutputWithContext(context.Background())
}

func (i PlaceIndexArray) ToPlaceIndexArrayOutputWithContext(ctx context.Context) PlaceIndexArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlaceIndexArrayOutput)
}

// PlaceIndexMapInput is an input type that accepts PlaceIndexMap and PlaceIndexMapOutput values.
// You can construct a concrete instance of `PlaceIndexMapInput` via:
//
//	PlaceIndexMap{ "key": PlaceIndexArgs{...} }
type PlaceIndexMapInput interface {
	pulumi.Input

	ToPlaceIndexMapOutput() PlaceIndexMapOutput
	ToPlaceIndexMapOutputWithContext(context.Context) PlaceIndexMapOutput
}

type PlaceIndexMap map[string]PlaceIndexInput

func (PlaceIndexMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PlaceIndex)(nil)).Elem()
}

func (i PlaceIndexMap) ToPlaceIndexMapOutput() PlaceIndexMapOutput {
	return i.ToPlaceIndexMapOutputWithContext(context.Background())
}

func (i PlaceIndexMap) ToPlaceIndexMapOutputWithContext(ctx context.Context) PlaceIndexMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlaceIndexMapOutput)
}

type PlaceIndexOutput struct{ *pulumi.OutputState }

func (PlaceIndexOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PlaceIndex)(nil)).Elem()
}

func (o PlaceIndexOutput) ToPlaceIndexOutput() PlaceIndexOutput {
	return o
}

func (o PlaceIndexOutput) ToPlaceIndexOutputWithContext(ctx context.Context) PlaceIndexOutput {
	return o
}

// The timestamp for when the place index resource was created in ISO 8601 format.
func (o PlaceIndexOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *PlaceIndex) pulumi.StringOutput { return v.CreateTime }).(pulumi.StringOutput)
}

// Specifies the geospatial data provider for the new place index.
func (o PlaceIndexOutput) DataSource() pulumi.StringOutput {
	return o.ApplyT(func(v *PlaceIndex) pulumi.StringOutput { return v.DataSource }).(pulumi.StringOutput)
}

// Configuration block with the data storage option chosen for requesting Places. Detailed below.
func (o PlaceIndexOutput) DataSourceConfiguration() PlaceIndexDataSourceConfigurationOutput {
	return o.ApplyT(func(v *PlaceIndex) PlaceIndexDataSourceConfigurationOutput { return v.DataSourceConfiguration }).(PlaceIndexDataSourceConfigurationOutput)
}

// The optional description for the place index resource.
func (o PlaceIndexOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PlaceIndex) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The Amazon Resource Name (ARN) for the place index resource. Used to specify a resource across AWS.
func (o PlaceIndexOutput) IndexArn() pulumi.StringOutput {
	return o.ApplyT(func(v *PlaceIndex) pulumi.StringOutput { return v.IndexArn }).(pulumi.StringOutput)
}

// The name of the place index resource.
//
// The following arguments are optional:
func (o PlaceIndexOutput) IndexName() pulumi.StringOutput {
	return o.ApplyT(func(v *PlaceIndex) pulumi.StringOutput { return v.IndexName }).(pulumi.StringOutput)
}

// Key-value tags for the place index. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o PlaceIndexOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PlaceIndex) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o PlaceIndexOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *PlaceIndex) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The timestamp for when the place index resource was last update in ISO 8601.
func (o PlaceIndexOutput) UpdateTime() pulumi.StringOutput {
	return o.ApplyT(func(v *PlaceIndex) pulumi.StringOutput { return v.UpdateTime }).(pulumi.StringOutput)
}

type PlaceIndexArrayOutput struct{ *pulumi.OutputState }

func (PlaceIndexArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PlaceIndex)(nil)).Elem()
}

func (o PlaceIndexArrayOutput) ToPlaceIndexArrayOutput() PlaceIndexArrayOutput {
	return o
}

func (o PlaceIndexArrayOutput) ToPlaceIndexArrayOutputWithContext(ctx context.Context) PlaceIndexArrayOutput {
	return o
}

func (o PlaceIndexArrayOutput) Index(i pulumi.IntInput) PlaceIndexOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PlaceIndex {
		return vs[0].([]*PlaceIndex)[vs[1].(int)]
	}).(PlaceIndexOutput)
}

type PlaceIndexMapOutput struct{ *pulumi.OutputState }

func (PlaceIndexMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PlaceIndex)(nil)).Elem()
}

func (o PlaceIndexMapOutput) ToPlaceIndexMapOutput() PlaceIndexMapOutput {
	return o
}

func (o PlaceIndexMapOutput) ToPlaceIndexMapOutputWithContext(ctx context.Context) PlaceIndexMapOutput {
	return o
}

func (o PlaceIndexMapOutput) MapIndex(k pulumi.StringInput) PlaceIndexOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PlaceIndex {
		return vs[0].(map[string]*PlaceIndex)[vs[1].(string)]
	}).(PlaceIndexOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PlaceIndexInput)(nil)).Elem(), &PlaceIndex{})
	pulumi.RegisterInputType(reflect.TypeOf((*PlaceIndexArrayInput)(nil)).Elem(), PlaceIndexArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PlaceIndexMapInput)(nil)).Elem(), PlaceIndexMap{})
	pulumi.RegisterOutputType(PlaceIndexOutput{})
	pulumi.RegisterOutputType(PlaceIndexArrayOutput{})
	pulumi.RegisterOutputType(PlaceIndexMapOutput{})
}
