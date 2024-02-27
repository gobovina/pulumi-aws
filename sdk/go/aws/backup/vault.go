// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package backup

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AWS Backup vault resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/backup"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := backup.NewVault(ctx, "example", &backup.VaultArgs{
//				KmsKeyArn: pulumi.Any(aws_kms_key.Example.Arn),
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
// Using `pulumi import`, import Backup vault using the `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:backup/vault:Vault test-vault TestVault
//
// ```
type Vault struct {
	pulumi.CustomResourceState

	// The ARN of the vault.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// A boolean that indicates that all recovery points stored in the vault are deleted so that the vault can be destroyed without error.
	ForceDestroy pulumi.BoolPtrOutput `pulumi:"forceDestroy"`
	// The server-side encryption key that is used to protect your backups.
	KmsKeyArn pulumi.StringOutput `pulumi:"kmsKeyArn"`
	// Name of the backup vault to create.
	Name pulumi.StringOutput `pulumi:"name"`
	// The number of recovery points that are stored in a backup vault.
	RecoveryPoints pulumi.IntOutput `pulumi:"recoveryPoints"`
	// Metadata that you can assign to help organize the resources that you create. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewVault registers a new resource with the given unique name, arguments, and options.
func NewVault(ctx *pulumi.Context,
	name string, args *VaultArgs, opts ...pulumi.ResourceOption) (*Vault, error) {
	if args == nil {
		args = &VaultArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Vault
	err := ctx.RegisterResource("aws:backup/vault:Vault", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVault gets an existing Vault resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVault(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VaultState, opts ...pulumi.ResourceOption) (*Vault, error) {
	var resource Vault
	err := ctx.ReadResource("aws:backup/vault:Vault", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Vault resources.
type vaultState struct {
	// The ARN of the vault.
	Arn *string `pulumi:"arn"`
	// A boolean that indicates that all recovery points stored in the vault are deleted so that the vault can be destroyed without error.
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// The server-side encryption key that is used to protect your backups.
	KmsKeyArn *string `pulumi:"kmsKeyArn"`
	// Name of the backup vault to create.
	Name *string `pulumi:"name"`
	// The number of recovery points that are stored in a backup vault.
	RecoveryPoints *int `pulumi:"recoveryPoints"`
	// Metadata that you can assign to help organize the resources that you create. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type VaultState struct {
	// The ARN of the vault.
	Arn pulumi.StringPtrInput
	// A boolean that indicates that all recovery points stored in the vault are deleted so that the vault can be destroyed without error.
	ForceDestroy pulumi.BoolPtrInput
	// The server-side encryption key that is used to protect your backups.
	KmsKeyArn pulumi.StringPtrInput
	// Name of the backup vault to create.
	Name pulumi.StringPtrInput
	// The number of recovery points that are stored in a backup vault.
	RecoveryPoints pulumi.IntPtrInput
	// Metadata that you can assign to help organize the resources that you create. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (VaultState) ElementType() reflect.Type {
	return reflect.TypeOf((*vaultState)(nil)).Elem()
}

type vaultArgs struct {
	// A boolean that indicates that all recovery points stored in the vault are deleted so that the vault can be destroyed without error.
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// The server-side encryption key that is used to protect your backups.
	KmsKeyArn *string `pulumi:"kmsKeyArn"`
	// Name of the backup vault to create.
	Name *string `pulumi:"name"`
	// Metadata that you can assign to help organize the resources that you create. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Vault resource.
type VaultArgs struct {
	// A boolean that indicates that all recovery points stored in the vault are deleted so that the vault can be destroyed without error.
	ForceDestroy pulumi.BoolPtrInput
	// The server-side encryption key that is used to protect your backups.
	KmsKeyArn pulumi.StringPtrInput
	// Name of the backup vault to create.
	Name pulumi.StringPtrInput
	// Metadata that you can assign to help organize the resources that you create. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (VaultArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vaultArgs)(nil)).Elem()
}

type VaultInput interface {
	pulumi.Input

	ToVaultOutput() VaultOutput
	ToVaultOutputWithContext(ctx context.Context) VaultOutput
}

func (*Vault) ElementType() reflect.Type {
	return reflect.TypeOf((**Vault)(nil)).Elem()
}

func (i *Vault) ToVaultOutput() VaultOutput {
	return i.ToVaultOutputWithContext(context.Background())
}

func (i *Vault) ToVaultOutputWithContext(ctx context.Context) VaultOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VaultOutput)
}

// VaultArrayInput is an input type that accepts VaultArray and VaultArrayOutput values.
// You can construct a concrete instance of `VaultArrayInput` via:
//
//	VaultArray{ VaultArgs{...} }
type VaultArrayInput interface {
	pulumi.Input

	ToVaultArrayOutput() VaultArrayOutput
	ToVaultArrayOutputWithContext(context.Context) VaultArrayOutput
}

type VaultArray []VaultInput

func (VaultArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Vault)(nil)).Elem()
}

func (i VaultArray) ToVaultArrayOutput() VaultArrayOutput {
	return i.ToVaultArrayOutputWithContext(context.Background())
}

func (i VaultArray) ToVaultArrayOutputWithContext(ctx context.Context) VaultArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VaultArrayOutput)
}

// VaultMapInput is an input type that accepts VaultMap and VaultMapOutput values.
// You can construct a concrete instance of `VaultMapInput` via:
//
//	VaultMap{ "key": VaultArgs{...} }
type VaultMapInput interface {
	pulumi.Input

	ToVaultMapOutput() VaultMapOutput
	ToVaultMapOutputWithContext(context.Context) VaultMapOutput
}

type VaultMap map[string]VaultInput

func (VaultMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Vault)(nil)).Elem()
}

func (i VaultMap) ToVaultMapOutput() VaultMapOutput {
	return i.ToVaultMapOutputWithContext(context.Background())
}

func (i VaultMap) ToVaultMapOutputWithContext(ctx context.Context) VaultMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VaultMapOutput)
}

type VaultOutput struct{ *pulumi.OutputState }

func (VaultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Vault)(nil)).Elem()
}

func (o VaultOutput) ToVaultOutput() VaultOutput {
	return o
}

func (o VaultOutput) ToVaultOutputWithContext(ctx context.Context) VaultOutput {
	return o
}

// The ARN of the vault.
func (o VaultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Vault) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// A boolean that indicates that all recovery points stored in the vault are deleted so that the vault can be destroyed without error.
func (o VaultOutput) ForceDestroy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Vault) pulumi.BoolPtrOutput { return v.ForceDestroy }).(pulumi.BoolPtrOutput)
}

// The server-side encryption key that is used to protect your backups.
func (o VaultOutput) KmsKeyArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Vault) pulumi.StringOutput { return v.KmsKeyArn }).(pulumi.StringOutput)
}

// Name of the backup vault to create.
func (o VaultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Vault) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The number of recovery points that are stored in a backup vault.
func (o VaultOutput) RecoveryPoints() pulumi.IntOutput {
	return o.ApplyT(func(v *Vault) pulumi.IntOutput { return v.RecoveryPoints }).(pulumi.IntOutput)
}

// Metadata that you can assign to help organize the resources that you create. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o VaultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Vault) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o VaultOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Vault) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type VaultArrayOutput struct{ *pulumi.OutputState }

func (VaultArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Vault)(nil)).Elem()
}

func (o VaultArrayOutput) ToVaultArrayOutput() VaultArrayOutput {
	return o
}

func (o VaultArrayOutput) ToVaultArrayOutputWithContext(ctx context.Context) VaultArrayOutput {
	return o
}

func (o VaultArrayOutput) Index(i pulumi.IntInput) VaultOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Vault {
		return vs[0].([]*Vault)[vs[1].(int)]
	}).(VaultOutput)
}

type VaultMapOutput struct{ *pulumi.OutputState }

func (VaultMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Vault)(nil)).Elem()
}

func (o VaultMapOutput) ToVaultMapOutput() VaultMapOutput {
	return o
}

func (o VaultMapOutput) ToVaultMapOutputWithContext(ctx context.Context) VaultMapOutput {
	return o
}

func (o VaultMapOutput) MapIndex(k pulumi.StringInput) VaultOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Vault {
		return vs[0].(map[string]*Vault)[vs[1].(string)]
	}).(VaultOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VaultInput)(nil)).Elem(), &Vault{})
	pulumi.RegisterInputType(reflect.TypeOf((*VaultArrayInput)(nil)).Elem(), VaultArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VaultMapInput)(nil)).Elem(), VaultMap{})
	pulumi.RegisterOutputType(VaultOutput{})
	pulumi.RegisterOutputType(VaultArrayOutput{})
	pulumi.RegisterOutputType(VaultMapOutput{})
}
