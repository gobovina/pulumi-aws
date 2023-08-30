// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package transfer

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a AWS Transfer Access resource.
//
// ## Example Usage
// ### Basic S3
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/transfer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := transfer.NewAccess(ctx, "example", &transfer.AccessArgs{
//				ExternalId:    pulumi.String("S-1-1-12-1234567890-123456789-1234567890-1234"),
//				ServerId:      pulumi.Any(aws_transfer_server.Example.Id),
//				Role:          pulumi.Any(aws_iam_role.Example.Arn),
//				HomeDirectory: pulumi.String(fmt.Sprintf("/%v/", aws_s3_bucket.Example.Id)),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Basic EFS
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/transfer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := transfer.NewAccess(ctx, "test", &transfer.AccessArgs{
//				ExternalId:    pulumi.String("S-1-1-12-1234567890-123456789-1234567890-1234"),
//				ServerId:      pulumi.Any(aws_transfer_server.Test.Id),
//				Role:          pulumi.Any(aws_iam_role.Test.Arn),
//				HomeDirectory: pulumi.String(fmt.Sprintf("/%v/", aws_efs_file_system.Test.Id)),
//				PosixProfile: &transfer.AccessPosixProfileArgs{
//					Gid: pulumi.Int(1000),
//					Uid: pulumi.Int(1000),
//				},
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
// Using `pulumi import`, import Transfer Accesses using the `server_id` and `external_id`. For example:
//
// ```sh
//
//	$ pulumi import aws:transfer/access:Access example s-12345678/S-1-1-12-1234567890-123456789-1234567890-1234
//
// ```
type Access struct {
	pulumi.CustomResourceState

	// The SID of a group in the directory connected to the Transfer Server (e.g., `S-1-1-12-1234567890-123456789-1234567890-1234`)
	ExternalId pulumi.StringOutput `pulumi:"externalId"`
	// The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
	HomeDirectory pulumi.StringPtrOutput `pulumi:"homeDirectory"`
	// Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
	HomeDirectoryMappings AccessHomeDirectoryMappingArrayOutput `pulumi:"homeDirectoryMappings"`
	// The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
	HomeDirectoryType pulumi.StringPtrOutput `pulumi:"homeDirectoryType"`
	// An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
	Policy pulumi.StringPtrOutput `pulumi:"policy"`
	// Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon EFS file systems. See Posix Profile below.
	PosixProfile AccessPosixProfilePtrOutput `pulumi:"posixProfile"`
	// Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
	Role pulumi.StringPtrOutput `pulumi:"role"`
	// The Server ID of the Transfer Server (e.g., `s-12345678`)
	ServerId pulumi.StringOutput `pulumi:"serverId"`
}

// NewAccess registers a new resource with the given unique name, arguments, and options.
func NewAccess(ctx *pulumi.Context,
	name string, args *AccessArgs, opts ...pulumi.ResourceOption) (*Access, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ExternalId == nil {
		return nil, errors.New("invalid value for required argument 'ExternalId'")
	}
	if args.ServerId == nil {
		return nil, errors.New("invalid value for required argument 'ServerId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Access
	err := ctx.RegisterResource("aws:transfer/access:Access", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccess gets an existing Access resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccess(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessState, opts ...pulumi.ResourceOption) (*Access, error) {
	var resource Access
	err := ctx.ReadResource("aws:transfer/access:Access", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Access resources.
type accessState struct {
	// The SID of a group in the directory connected to the Transfer Server (e.g., `S-1-1-12-1234567890-123456789-1234567890-1234`)
	ExternalId *string `pulumi:"externalId"`
	// The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
	HomeDirectory *string `pulumi:"homeDirectory"`
	// Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
	HomeDirectoryMappings []AccessHomeDirectoryMapping `pulumi:"homeDirectoryMappings"`
	// The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
	HomeDirectoryType *string `pulumi:"homeDirectoryType"`
	// An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
	Policy *string `pulumi:"policy"`
	// Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon EFS file systems. See Posix Profile below.
	PosixProfile *AccessPosixProfile `pulumi:"posixProfile"`
	// Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
	Role *string `pulumi:"role"`
	// The Server ID of the Transfer Server (e.g., `s-12345678`)
	ServerId *string `pulumi:"serverId"`
}

type AccessState struct {
	// The SID of a group in the directory connected to the Transfer Server (e.g., `S-1-1-12-1234567890-123456789-1234567890-1234`)
	ExternalId pulumi.StringPtrInput
	// The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
	HomeDirectory pulumi.StringPtrInput
	// Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
	HomeDirectoryMappings AccessHomeDirectoryMappingArrayInput
	// The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
	HomeDirectoryType pulumi.StringPtrInput
	// An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
	Policy pulumi.StringPtrInput
	// Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon EFS file systems. See Posix Profile below.
	PosixProfile AccessPosixProfilePtrInput
	// Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
	Role pulumi.StringPtrInput
	// The Server ID of the Transfer Server (e.g., `s-12345678`)
	ServerId pulumi.StringPtrInput
}

func (AccessState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessState)(nil)).Elem()
}

type accessArgs struct {
	// The SID of a group in the directory connected to the Transfer Server (e.g., `S-1-1-12-1234567890-123456789-1234567890-1234`)
	ExternalId string `pulumi:"externalId"`
	// The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
	HomeDirectory *string `pulumi:"homeDirectory"`
	// Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
	HomeDirectoryMappings []AccessHomeDirectoryMapping `pulumi:"homeDirectoryMappings"`
	// The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
	HomeDirectoryType *string `pulumi:"homeDirectoryType"`
	// An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
	Policy *string `pulumi:"policy"`
	// Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon EFS file systems. See Posix Profile below.
	PosixProfile *AccessPosixProfile `pulumi:"posixProfile"`
	// Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
	Role *string `pulumi:"role"`
	// The Server ID of the Transfer Server (e.g., `s-12345678`)
	ServerId string `pulumi:"serverId"`
}

// The set of arguments for constructing a Access resource.
type AccessArgs struct {
	// The SID of a group in the directory connected to the Transfer Server (e.g., `S-1-1-12-1234567890-123456789-1234567890-1234`)
	ExternalId pulumi.StringInput
	// The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
	HomeDirectory pulumi.StringPtrInput
	// Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
	HomeDirectoryMappings AccessHomeDirectoryMappingArrayInput
	// The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
	HomeDirectoryType pulumi.StringPtrInput
	// An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
	Policy pulumi.StringPtrInput
	// Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon EFS file systems. See Posix Profile below.
	PosixProfile AccessPosixProfilePtrInput
	// Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
	Role pulumi.StringPtrInput
	// The Server ID of the Transfer Server (e.g., `s-12345678`)
	ServerId pulumi.StringInput
}

func (AccessArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessArgs)(nil)).Elem()
}

type AccessInput interface {
	pulumi.Input

	ToAccessOutput() AccessOutput
	ToAccessOutputWithContext(ctx context.Context) AccessOutput
}

func (*Access) ElementType() reflect.Type {
	return reflect.TypeOf((**Access)(nil)).Elem()
}

func (i *Access) ToAccessOutput() AccessOutput {
	return i.ToAccessOutputWithContext(context.Background())
}

func (i *Access) ToAccessOutputWithContext(ctx context.Context) AccessOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessOutput)
}

// AccessArrayInput is an input type that accepts AccessArray and AccessArrayOutput values.
// You can construct a concrete instance of `AccessArrayInput` via:
//
//	AccessArray{ AccessArgs{...} }
type AccessArrayInput interface {
	pulumi.Input

	ToAccessArrayOutput() AccessArrayOutput
	ToAccessArrayOutputWithContext(context.Context) AccessArrayOutput
}

type AccessArray []AccessInput

func (AccessArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Access)(nil)).Elem()
}

func (i AccessArray) ToAccessArrayOutput() AccessArrayOutput {
	return i.ToAccessArrayOutputWithContext(context.Background())
}

func (i AccessArray) ToAccessArrayOutputWithContext(ctx context.Context) AccessArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessArrayOutput)
}

// AccessMapInput is an input type that accepts AccessMap and AccessMapOutput values.
// You can construct a concrete instance of `AccessMapInput` via:
//
//	AccessMap{ "key": AccessArgs{...} }
type AccessMapInput interface {
	pulumi.Input

	ToAccessMapOutput() AccessMapOutput
	ToAccessMapOutputWithContext(context.Context) AccessMapOutput
}

type AccessMap map[string]AccessInput

func (AccessMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Access)(nil)).Elem()
}

func (i AccessMap) ToAccessMapOutput() AccessMapOutput {
	return i.ToAccessMapOutputWithContext(context.Background())
}

func (i AccessMap) ToAccessMapOutputWithContext(ctx context.Context) AccessMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessMapOutput)
}

type AccessOutput struct{ *pulumi.OutputState }

func (AccessOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Access)(nil)).Elem()
}

func (o AccessOutput) ToAccessOutput() AccessOutput {
	return o
}

func (o AccessOutput) ToAccessOutputWithContext(ctx context.Context) AccessOutput {
	return o
}

// The SID of a group in the directory connected to the Transfer Server (e.g., `S-1-1-12-1234567890-123456789-1234567890-1234`)
func (o AccessOutput) ExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v *Access) pulumi.StringOutput { return v.ExternalId }).(pulumi.StringOutput)
}

// The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
func (o AccessOutput) HomeDirectory() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Access) pulumi.StringPtrOutput { return v.HomeDirectory }).(pulumi.StringPtrOutput)
}

// Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
func (o AccessOutput) HomeDirectoryMappings() AccessHomeDirectoryMappingArrayOutput {
	return o.ApplyT(func(v *Access) AccessHomeDirectoryMappingArrayOutput { return v.HomeDirectoryMappings }).(AccessHomeDirectoryMappingArrayOutput)
}

// The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
func (o AccessOutput) HomeDirectoryType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Access) pulumi.StringPtrOutput { return v.HomeDirectoryType }).(pulumi.StringPtrOutput)
}

// An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
func (o AccessOutput) Policy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Access) pulumi.StringPtrOutput { return v.Policy }).(pulumi.StringPtrOutput)
}

// Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon EFS file systems. See Posix Profile below.
func (o AccessOutput) PosixProfile() AccessPosixProfilePtrOutput {
	return o.ApplyT(func(v *Access) AccessPosixProfilePtrOutput { return v.PosixProfile }).(AccessPosixProfilePtrOutput)
}

// Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
func (o AccessOutput) Role() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Access) pulumi.StringPtrOutput { return v.Role }).(pulumi.StringPtrOutput)
}

// The Server ID of the Transfer Server (e.g., `s-12345678`)
func (o AccessOutput) ServerId() pulumi.StringOutput {
	return o.ApplyT(func(v *Access) pulumi.StringOutput { return v.ServerId }).(pulumi.StringOutput)
}

type AccessArrayOutput struct{ *pulumi.OutputState }

func (AccessArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Access)(nil)).Elem()
}

func (o AccessArrayOutput) ToAccessArrayOutput() AccessArrayOutput {
	return o
}

func (o AccessArrayOutput) ToAccessArrayOutputWithContext(ctx context.Context) AccessArrayOutput {
	return o
}

func (o AccessArrayOutput) Index(i pulumi.IntInput) AccessOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Access {
		return vs[0].([]*Access)[vs[1].(int)]
	}).(AccessOutput)
}

type AccessMapOutput struct{ *pulumi.OutputState }

func (AccessMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Access)(nil)).Elem()
}

func (o AccessMapOutput) ToAccessMapOutput() AccessMapOutput {
	return o
}

func (o AccessMapOutput) ToAccessMapOutputWithContext(ctx context.Context) AccessMapOutput {
	return o
}

func (o AccessMapOutput) MapIndex(k pulumi.StringInput) AccessOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Access {
		return vs[0].(map[string]*Access)[vs[1].(string)]
	}).(AccessOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessInput)(nil)).Elem(), &Access{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessArrayInput)(nil)).Elem(), AccessArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessMapInput)(nil)).Elem(), AccessMap{})
	pulumi.RegisterOutputType(AccessOutput{})
	pulumi.RegisterOutputType(AccessArrayOutput{})
	pulumi.RegisterOutputType(AccessMapOutput{})
}
