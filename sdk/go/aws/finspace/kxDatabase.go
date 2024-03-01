// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package finspace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS FinSpace Kx Database.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/finspace"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/kms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := kms.NewKey(ctx, "example", &kms.KeyArgs{
//				Description:          pulumi.String("Example KMS Key"),
//				DeletionWindowInDays: pulumi.Int(7),
//			})
//			if err != nil {
//				return err
//			}
//			exampleKxEnvironment, err := finspace.NewKxEnvironment(ctx, "example", &finspace.KxEnvironmentArgs{
//				Name:     pulumi.String("my-tf-kx-environment"),
//				KmsKeyId: example.Arn,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = finspace.NewKxDatabase(ctx, "example", &finspace.KxDatabaseArgs{
//				EnvironmentId: exampleKxEnvironment.ID(),
//				Name:          pulumi.String("my-tf-kx-database"),
//				Description:   pulumi.String("Example database description"),
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
// Using `pulumi import`, import an AWS FinSpace Kx Database using the `id` (environment ID and database name, comma-delimited). For example:
//
// ```sh
//
//	$ pulumi import aws:finspace/kxDatabase:KxDatabase example n3ceo7wqxoxcti5tujqwzs,my-tf-kx-database
//
// ```
type KxDatabase struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) identifier of the KX database.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Timestamp at which the databse is created in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
	CreatedTimestamp pulumi.StringOutput `pulumi:"createdTimestamp"`
	// Description of the KX database.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique identifier for the KX environment.
	EnvironmentId pulumi.StringOutput `pulumi:"environmentId"`
	// Last timestamp at which the database was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
	LastModifiedTimestamp pulumi.StringOutput `pulumi:"lastModifiedTimestamp"`
	// Name of the KX database.
	//
	// The following arguments are optional:
	Name pulumi.StringOutput `pulumi:"name"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewKxDatabase registers a new resource with the given unique name, arguments, and options.
func NewKxDatabase(ctx *pulumi.Context,
	name string, args *KxDatabaseArgs, opts ...pulumi.ResourceOption) (*KxDatabase, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnvironmentId == nil {
		return nil, errors.New("invalid value for required argument 'EnvironmentId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource KxDatabase
	err := ctx.RegisterResource("aws:finspace/kxDatabase:KxDatabase", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKxDatabase gets an existing KxDatabase resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKxDatabase(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KxDatabaseState, opts ...pulumi.ResourceOption) (*KxDatabase, error) {
	var resource KxDatabase
	err := ctx.ReadResource("aws:finspace/kxDatabase:KxDatabase", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KxDatabase resources.
type kxDatabaseState struct {
	// Amazon Resource Name (ARN) identifier of the KX database.
	Arn *string `pulumi:"arn"`
	// Timestamp at which the databse is created in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
	CreatedTimestamp *string `pulumi:"createdTimestamp"`
	// Description of the KX database.
	Description *string `pulumi:"description"`
	// Unique identifier for the KX environment.
	EnvironmentId *string `pulumi:"environmentId"`
	// Last timestamp at which the database was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
	LastModifiedTimestamp *string `pulumi:"lastModifiedTimestamp"`
	// Name of the KX database.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type KxDatabaseState struct {
	// Amazon Resource Name (ARN) identifier of the KX database.
	Arn pulumi.StringPtrInput
	// Timestamp at which the databse is created in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
	CreatedTimestamp pulumi.StringPtrInput
	// Description of the KX database.
	Description pulumi.StringPtrInput
	// Unique identifier for the KX environment.
	EnvironmentId pulumi.StringPtrInput
	// Last timestamp at which the database was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
	LastModifiedTimestamp pulumi.StringPtrInput
	// Name of the KX database.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (KxDatabaseState) ElementType() reflect.Type {
	return reflect.TypeOf((*kxDatabaseState)(nil)).Elem()
}

type kxDatabaseArgs struct {
	// Description of the KX database.
	Description *string `pulumi:"description"`
	// Unique identifier for the KX environment.
	EnvironmentId string `pulumi:"environmentId"`
	// Name of the KX database.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a KxDatabase resource.
type KxDatabaseArgs struct {
	// Description of the KX database.
	Description pulumi.StringPtrInput
	// Unique identifier for the KX environment.
	EnvironmentId pulumi.StringInput
	// Name of the KX database.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (KxDatabaseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kxDatabaseArgs)(nil)).Elem()
}

type KxDatabaseInput interface {
	pulumi.Input

	ToKxDatabaseOutput() KxDatabaseOutput
	ToKxDatabaseOutputWithContext(ctx context.Context) KxDatabaseOutput
}

func (*KxDatabase) ElementType() reflect.Type {
	return reflect.TypeOf((**KxDatabase)(nil)).Elem()
}

func (i *KxDatabase) ToKxDatabaseOutput() KxDatabaseOutput {
	return i.ToKxDatabaseOutputWithContext(context.Background())
}

func (i *KxDatabase) ToKxDatabaseOutputWithContext(ctx context.Context) KxDatabaseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KxDatabaseOutput)
}

// KxDatabaseArrayInput is an input type that accepts KxDatabaseArray and KxDatabaseArrayOutput values.
// You can construct a concrete instance of `KxDatabaseArrayInput` via:
//
//	KxDatabaseArray{ KxDatabaseArgs{...} }
type KxDatabaseArrayInput interface {
	pulumi.Input

	ToKxDatabaseArrayOutput() KxDatabaseArrayOutput
	ToKxDatabaseArrayOutputWithContext(context.Context) KxDatabaseArrayOutput
}

type KxDatabaseArray []KxDatabaseInput

func (KxDatabaseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KxDatabase)(nil)).Elem()
}

func (i KxDatabaseArray) ToKxDatabaseArrayOutput() KxDatabaseArrayOutput {
	return i.ToKxDatabaseArrayOutputWithContext(context.Background())
}

func (i KxDatabaseArray) ToKxDatabaseArrayOutputWithContext(ctx context.Context) KxDatabaseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KxDatabaseArrayOutput)
}

// KxDatabaseMapInput is an input type that accepts KxDatabaseMap and KxDatabaseMapOutput values.
// You can construct a concrete instance of `KxDatabaseMapInput` via:
//
//	KxDatabaseMap{ "key": KxDatabaseArgs{...} }
type KxDatabaseMapInput interface {
	pulumi.Input

	ToKxDatabaseMapOutput() KxDatabaseMapOutput
	ToKxDatabaseMapOutputWithContext(context.Context) KxDatabaseMapOutput
}

type KxDatabaseMap map[string]KxDatabaseInput

func (KxDatabaseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KxDatabase)(nil)).Elem()
}

func (i KxDatabaseMap) ToKxDatabaseMapOutput() KxDatabaseMapOutput {
	return i.ToKxDatabaseMapOutputWithContext(context.Background())
}

func (i KxDatabaseMap) ToKxDatabaseMapOutputWithContext(ctx context.Context) KxDatabaseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KxDatabaseMapOutput)
}

type KxDatabaseOutput struct{ *pulumi.OutputState }

func (KxDatabaseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KxDatabase)(nil)).Elem()
}

func (o KxDatabaseOutput) ToKxDatabaseOutput() KxDatabaseOutput {
	return o
}

func (o KxDatabaseOutput) ToKxDatabaseOutputWithContext(ctx context.Context) KxDatabaseOutput {
	return o
}

// Amazon Resource Name (ARN) identifier of the KX database.
func (o KxDatabaseOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *KxDatabase) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Timestamp at which the databse is created in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
func (o KxDatabaseOutput) CreatedTimestamp() pulumi.StringOutput {
	return o.ApplyT(func(v *KxDatabase) pulumi.StringOutput { return v.CreatedTimestamp }).(pulumi.StringOutput)
}

// Description of the KX database.
func (o KxDatabaseOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KxDatabase) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier for the KX environment.
func (o KxDatabaseOutput) EnvironmentId() pulumi.StringOutput {
	return o.ApplyT(func(v *KxDatabase) pulumi.StringOutput { return v.EnvironmentId }).(pulumi.StringOutput)
}

// Last timestamp at which the database was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
func (o KxDatabaseOutput) LastModifiedTimestamp() pulumi.StringOutput {
	return o.ApplyT(func(v *KxDatabase) pulumi.StringOutput { return v.LastModifiedTimestamp }).(pulumi.StringOutput)
}

// Name of the KX database.
//
// The following arguments are optional:
func (o KxDatabaseOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *KxDatabase) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o KxDatabaseOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *KxDatabase) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o KxDatabaseOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *KxDatabase) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type KxDatabaseArrayOutput struct{ *pulumi.OutputState }

func (KxDatabaseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KxDatabase)(nil)).Elem()
}

func (o KxDatabaseArrayOutput) ToKxDatabaseArrayOutput() KxDatabaseArrayOutput {
	return o
}

func (o KxDatabaseArrayOutput) ToKxDatabaseArrayOutputWithContext(ctx context.Context) KxDatabaseArrayOutput {
	return o
}

func (o KxDatabaseArrayOutput) Index(i pulumi.IntInput) KxDatabaseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KxDatabase {
		return vs[0].([]*KxDatabase)[vs[1].(int)]
	}).(KxDatabaseOutput)
}

type KxDatabaseMapOutput struct{ *pulumi.OutputState }

func (KxDatabaseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KxDatabase)(nil)).Elem()
}

func (o KxDatabaseMapOutput) ToKxDatabaseMapOutput() KxDatabaseMapOutput {
	return o
}

func (o KxDatabaseMapOutput) ToKxDatabaseMapOutputWithContext(ctx context.Context) KxDatabaseMapOutput {
	return o
}

func (o KxDatabaseMapOutput) MapIndex(k pulumi.StringInput) KxDatabaseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KxDatabase {
		return vs[0].(map[string]*KxDatabase)[vs[1].(string)]
	}).(KxDatabaseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KxDatabaseInput)(nil)).Elem(), &KxDatabase{})
	pulumi.RegisterInputType(reflect.TypeOf((*KxDatabaseArrayInput)(nil)).Elem(), KxDatabaseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KxDatabaseMapInput)(nil)).Elem(), KxDatabaseMap{})
	pulumi.RegisterOutputType(KxDatabaseOutput{})
	pulumi.RegisterOutputType(KxDatabaseArrayOutput{})
	pulumi.RegisterOutputType(KxDatabaseMapOutput{})
}
