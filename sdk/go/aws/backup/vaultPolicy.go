// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package backup

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an AWS Backup vault policy resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/backup"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleVault, err := backup.NewVault(ctx, "example", &backup.VaultArgs{
//				Name: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			example := iam.GetPolicyDocumentOutput(ctx, iam.GetPolicyDocumentOutputArgs{
//				Statements: iam.GetPolicyDocumentStatementArray{
//					&iam.GetPolicyDocumentStatementArgs{
//						Effect: pulumi.String("Allow"),
//						Principals: iam.GetPolicyDocumentStatementPrincipalArray{
//							&iam.GetPolicyDocumentStatementPrincipalArgs{
//								Type: pulumi.String("AWS"),
//								Identifiers: pulumi.StringArray{
//									pulumi.String("*"),
//								},
//							},
//						},
//						Actions: pulumi.StringArray{
//							pulumi.String("backup:DescribeBackupVault"),
//							pulumi.String("backup:DeleteBackupVault"),
//							pulumi.String("backup:PutBackupVaultAccessPolicy"),
//							pulumi.String("backup:DeleteBackupVaultAccessPolicy"),
//							pulumi.String("backup:GetBackupVaultAccessPolicy"),
//							pulumi.String("backup:StartBackupJob"),
//							pulumi.String("backup:GetBackupVaultNotifications"),
//							pulumi.String("backup:PutBackupVaultNotifications"),
//						},
//						Resources: pulumi.StringArray{
//							exampleVault.Arn,
//						},
//					},
//				},
//			}, nil)
//			_, err = backup.NewVaultPolicy(ctx, "example", &backup.VaultPolicyArgs{
//				BackupVaultName: exampleVault.Name,
//				Policy: example.ApplyT(func(example iam.GetPolicyDocumentResult) (*string, error) {
//					return &example.Json, nil
//				}).(pulumi.StringPtrOutput),
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
// Using `pulumi import`, import Backup vault policy using the `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:backup/vaultPolicy:VaultPolicy test TestVault
//
// ```
type VaultPolicy struct {
	pulumi.CustomResourceState

	// The ARN of the vault.
	BackupVaultArn pulumi.StringOutput `pulumi:"backupVaultArn"`
	// Name of the backup vault to add policy for.
	BackupVaultName pulumi.StringOutput `pulumi:"backupVaultName"`
	// The backup vault access policy document in JSON format.
	Policy pulumi.StringOutput `pulumi:"policy"`
}

// NewVaultPolicy registers a new resource with the given unique name, arguments, and options.
func NewVaultPolicy(ctx *pulumi.Context,
	name string, args *VaultPolicyArgs, opts ...pulumi.ResourceOption) (*VaultPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.BackupVaultName == nil {
		return nil, errors.New("invalid value for required argument 'BackupVaultName'")
	}
	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VaultPolicy
	err := ctx.RegisterResource("aws:backup/vaultPolicy:VaultPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVaultPolicy gets an existing VaultPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVaultPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VaultPolicyState, opts ...pulumi.ResourceOption) (*VaultPolicy, error) {
	var resource VaultPolicy
	err := ctx.ReadResource("aws:backup/vaultPolicy:VaultPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VaultPolicy resources.
type vaultPolicyState struct {
	// The ARN of the vault.
	BackupVaultArn *string `pulumi:"backupVaultArn"`
	// Name of the backup vault to add policy for.
	BackupVaultName *string `pulumi:"backupVaultName"`
	// The backup vault access policy document in JSON format.
	Policy *string `pulumi:"policy"`
}

type VaultPolicyState struct {
	// The ARN of the vault.
	BackupVaultArn pulumi.StringPtrInput
	// Name of the backup vault to add policy for.
	BackupVaultName pulumi.StringPtrInput
	// The backup vault access policy document in JSON format.
	Policy pulumi.StringPtrInput
}

func (VaultPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*vaultPolicyState)(nil)).Elem()
}

type vaultPolicyArgs struct {
	// Name of the backup vault to add policy for.
	BackupVaultName string `pulumi:"backupVaultName"`
	// The backup vault access policy document in JSON format.
	Policy string `pulumi:"policy"`
}

// The set of arguments for constructing a VaultPolicy resource.
type VaultPolicyArgs struct {
	// Name of the backup vault to add policy for.
	BackupVaultName pulumi.StringInput
	// The backup vault access policy document in JSON format.
	Policy pulumi.StringInput
}

func (VaultPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vaultPolicyArgs)(nil)).Elem()
}

type VaultPolicyInput interface {
	pulumi.Input

	ToVaultPolicyOutput() VaultPolicyOutput
	ToVaultPolicyOutputWithContext(ctx context.Context) VaultPolicyOutput
}

func (*VaultPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**VaultPolicy)(nil)).Elem()
}

func (i *VaultPolicy) ToVaultPolicyOutput() VaultPolicyOutput {
	return i.ToVaultPolicyOutputWithContext(context.Background())
}

func (i *VaultPolicy) ToVaultPolicyOutputWithContext(ctx context.Context) VaultPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VaultPolicyOutput)
}

// VaultPolicyArrayInput is an input type that accepts VaultPolicyArray and VaultPolicyArrayOutput values.
// You can construct a concrete instance of `VaultPolicyArrayInput` via:
//
//	VaultPolicyArray{ VaultPolicyArgs{...} }
type VaultPolicyArrayInput interface {
	pulumi.Input

	ToVaultPolicyArrayOutput() VaultPolicyArrayOutput
	ToVaultPolicyArrayOutputWithContext(context.Context) VaultPolicyArrayOutput
}

type VaultPolicyArray []VaultPolicyInput

func (VaultPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VaultPolicy)(nil)).Elem()
}

func (i VaultPolicyArray) ToVaultPolicyArrayOutput() VaultPolicyArrayOutput {
	return i.ToVaultPolicyArrayOutputWithContext(context.Background())
}

func (i VaultPolicyArray) ToVaultPolicyArrayOutputWithContext(ctx context.Context) VaultPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VaultPolicyArrayOutput)
}

// VaultPolicyMapInput is an input type that accepts VaultPolicyMap and VaultPolicyMapOutput values.
// You can construct a concrete instance of `VaultPolicyMapInput` via:
//
//	VaultPolicyMap{ "key": VaultPolicyArgs{...} }
type VaultPolicyMapInput interface {
	pulumi.Input

	ToVaultPolicyMapOutput() VaultPolicyMapOutput
	ToVaultPolicyMapOutputWithContext(context.Context) VaultPolicyMapOutput
}

type VaultPolicyMap map[string]VaultPolicyInput

func (VaultPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VaultPolicy)(nil)).Elem()
}

func (i VaultPolicyMap) ToVaultPolicyMapOutput() VaultPolicyMapOutput {
	return i.ToVaultPolicyMapOutputWithContext(context.Background())
}

func (i VaultPolicyMap) ToVaultPolicyMapOutputWithContext(ctx context.Context) VaultPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VaultPolicyMapOutput)
}

type VaultPolicyOutput struct{ *pulumi.OutputState }

func (VaultPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VaultPolicy)(nil)).Elem()
}

func (o VaultPolicyOutput) ToVaultPolicyOutput() VaultPolicyOutput {
	return o
}

func (o VaultPolicyOutput) ToVaultPolicyOutputWithContext(ctx context.Context) VaultPolicyOutput {
	return o
}

// The ARN of the vault.
func (o VaultPolicyOutput) BackupVaultArn() pulumi.StringOutput {
	return o.ApplyT(func(v *VaultPolicy) pulumi.StringOutput { return v.BackupVaultArn }).(pulumi.StringOutput)
}

// Name of the backup vault to add policy for.
func (o VaultPolicyOutput) BackupVaultName() pulumi.StringOutput {
	return o.ApplyT(func(v *VaultPolicy) pulumi.StringOutput { return v.BackupVaultName }).(pulumi.StringOutput)
}

// The backup vault access policy document in JSON format.
func (o VaultPolicyOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v *VaultPolicy) pulumi.StringOutput { return v.Policy }).(pulumi.StringOutput)
}

type VaultPolicyArrayOutput struct{ *pulumi.OutputState }

func (VaultPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VaultPolicy)(nil)).Elem()
}

func (o VaultPolicyArrayOutput) ToVaultPolicyArrayOutput() VaultPolicyArrayOutput {
	return o
}

func (o VaultPolicyArrayOutput) ToVaultPolicyArrayOutputWithContext(ctx context.Context) VaultPolicyArrayOutput {
	return o
}

func (o VaultPolicyArrayOutput) Index(i pulumi.IntInput) VaultPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VaultPolicy {
		return vs[0].([]*VaultPolicy)[vs[1].(int)]
	}).(VaultPolicyOutput)
}

type VaultPolicyMapOutput struct{ *pulumi.OutputState }

func (VaultPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VaultPolicy)(nil)).Elem()
}

func (o VaultPolicyMapOutput) ToVaultPolicyMapOutput() VaultPolicyMapOutput {
	return o
}

func (o VaultPolicyMapOutput) ToVaultPolicyMapOutputWithContext(ctx context.Context) VaultPolicyMapOutput {
	return o
}

func (o VaultPolicyMapOutput) MapIndex(k pulumi.StringInput) VaultPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VaultPolicy {
		return vs[0].(map[string]*VaultPolicy)[vs[1].(string)]
	}).(VaultPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VaultPolicyInput)(nil)).Elem(), &VaultPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*VaultPolicyArrayInput)(nil)).Elem(), VaultPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VaultPolicyMapInput)(nil)).Elem(), VaultPolicyMap{})
	pulumi.RegisterOutputType(VaultPolicyOutput{})
	pulumi.RegisterOutputType(VaultPolicyArrayOutput{})
	pulumi.RegisterOutputType(VaultPolicyMapOutput{})
}
