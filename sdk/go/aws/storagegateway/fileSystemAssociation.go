// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package storagegateway

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Associate an Amazon FSx file system with the FSx File Gateway. After the association process is complete, the file shares on the Amazon FSx file system are available for access through the gateway. This operation only supports the FSx File Gateway type.
//
// [FSx File Gateway requirements](https://docs.aws.amazon.com/filegateway/latest/filefsxw/Requirements.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/storagegateway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := storagegateway.NewFileSystemAssociation(ctx, "example", &storagegateway.FileSystemAssociationArgs{
//				GatewayArn:          pulumi.Any(aws_storagegateway_gateway.Example.Arn),
//				LocationArn:         pulumi.Any(aws_fsx_windows_file_system.Example.Arn),
//				Username:            pulumi.String("Admin"),
//				Password:            pulumi.String("avoid-plaintext-passwords"),
//				AuditDestinationArn: pulumi.Any(aws_s3_bucket.Example.Arn),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Required Services Example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/fsx"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ssm"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/storagegateway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			awsServiceStoragegatewayAmiFILES3Latest, err := ssm.LookupParameter(ctx, &ssm.LookupParameterArgs{
//				Name: "/aws/service/storagegateway/ami/FILE_S3/latest",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			testInstance, err := ec2.NewInstance(ctx, "testInstance", &ec2.InstanceArgs{
//				Ami:                      *pulumi.String(awsServiceStoragegatewayAmiFILES3Latest.Value),
//				AssociatePublicIpAddress: pulumi.Bool(true),
//				InstanceType:             ec2.InstanceType(data.Aws_ec2_instance_type_offering.Available.Instance_type),
//				VpcSecurityGroupIds: pulumi.StringArray{
//					aws_security_group.Test.Id,
//				},
//				SubnetId: pulumi.Any(aws_subnet.Test[0].Id),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				aws_route.Test,
//				aws_vpc_dhcp_options_association.Test,
//			}))
//			if err != nil {
//				return err
//			}
//			testGateway, err := storagegateway.NewGateway(ctx, "testGateway", &storagegateway.GatewayArgs{
//				GatewayIpAddress: testInstance.PublicIp,
//				GatewayName:      pulumi.String("test-sgw"),
//				GatewayTimezone:  pulumi.String("GMT"),
//				GatewayType:      pulumi.String("FILE_FSX_SMB"),
//				SmbActiveDirectorySettings: &storagegateway.GatewaySmbActiveDirectorySettingsArgs{
//					DomainName: pulumi.Any(aws_directory_service_directory.Test.Name),
//					Password:   pulumi.Any(aws_directory_service_directory.Test.Password),
//					Username:   pulumi.String("Admin"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			testWindowsFileSystem, err := fsx.NewWindowsFileSystem(ctx, "testWindowsFileSystem", &fsx.WindowsFileSystemArgs{
//				ActiveDirectoryId: pulumi.Any(aws_directory_service_directory.Test.Id),
//				SecurityGroupIds: pulumi.StringArray{
//					aws_security_group.Test.Id,
//				},
//				SkipFinalBackup: pulumi.Bool(true),
//				StorageCapacity: pulumi.Int(32),
//				SubnetIds: pulumi.StringArray{
//					aws_subnet.Test[0].Id,
//				},
//				ThroughputCapacity: pulumi.Int(8),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = storagegateway.NewFileSystemAssociation(ctx, "fsx", &storagegateway.FileSystemAssociationArgs{
//				GatewayArn:  testGateway.Arn,
//				LocationArn: testWindowsFileSystem.Arn,
//				Username:    pulumi.String("Admin"),
//				Password:    pulumi.Any(aws_directory_service_directory.Test.Password),
//				CacheAttributes: &storagegateway.FileSystemAssociationCacheAttributesArgs{
//					CacheStaleTimeoutInSeconds: pulumi.Int(400),
//				},
//				AuditDestinationArn: pulumi.Any(aws_cloudwatch_log_group.Test.Arn),
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
// Using `pulumi import`, import `aws_storagegateway_file_system_association` using the FSx file system association Amazon Resource Name (ARN). For example:
//
// ```sh
//
//	$ pulumi import aws:storagegateway/fileSystemAssociation:FileSystemAssociation example arn:aws:storagegateway:us-east-1:123456789012:fs-association/fsa-0DA347732FDB40125
//
// ```
type FileSystemAssociation struct {
	pulumi.CustomResourceState

	// Amazon Resource Name (ARN) of the newly created file system association.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The Amazon Resource Name (ARN) of the storage used for the audit logs.
	AuditDestinationArn pulumi.StringPtrOutput `pulumi:"auditDestinationArn"`
	// Refresh cache information. see Cache Attributes for more details.
	CacheAttributes FileSystemAssociationCacheAttributesPtrOutput `pulumi:"cacheAttributes"`
	// The Amazon Resource Name (ARN) of the gateway.
	GatewayArn pulumi.StringOutput `pulumi:"gatewayArn"`
	// The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
	LocationArn pulumi.StringOutput `pulumi:"locationArn"`
	// The password of the user credential.
	Password pulumi.StringOutput `pulumi:"password"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The user name of the user credential that has permission to access the root share of the Amazon FSx file system. The user account must belong to the Amazon FSx delegated admin user group.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewFileSystemAssociation registers a new resource with the given unique name, arguments, and options.
func NewFileSystemAssociation(ctx *pulumi.Context,
	name string, args *FileSystemAssociationArgs, opts ...pulumi.ResourceOption) (*FileSystemAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GatewayArn == nil {
		return nil, errors.New("invalid value for required argument 'GatewayArn'")
	}
	if args.LocationArn == nil {
		return nil, errors.New("invalid value for required argument 'LocationArn'")
	}
	if args.Password == nil {
		return nil, errors.New("invalid value for required argument 'Password'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FileSystemAssociation
	err := ctx.RegisterResource("aws:storagegateway/fileSystemAssociation:FileSystemAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFileSystemAssociation gets an existing FileSystemAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFileSystemAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FileSystemAssociationState, opts ...pulumi.ResourceOption) (*FileSystemAssociation, error) {
	var resource FileSystemAssociation
	err := ctx.ReadResource("aws:storagegateway/fileSystemAssociation:FileSystemAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FileSystemAssociation resources.
type fileSystemAssociationState struct {
	// Amazon Resource Name (ARN) of the newly created file system association.
	Arn *string `pulumi:"arn"`
	// The Amazon Resource Name (ARN) of the storage used for the audit logs.
	AuditDestinationArn *string `pulumi:"auditDestinationArn"`
	// Refresh cache information. see Cache Attributes for more details.
	CacheAttributes *FileSystemAssociationCacheAttributes `pulumi:"cacheAttributes"`
	// The Amazon Resource Name (ARN) of the gateway.
	GatewayArn *string `pulumi:"gatewayArn"`
	// The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
	LocationArn *string `pulumi:"locationArn"`
	// The password of the user credential.
	Password *string `pulumi:"password"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The user name of the user credential that has permission to access the root share of the Amazon FSx file system. The user account must belong to the Amazon FSx delegated admin user group.
	Username *string `pulumi:"username"`
}

type FileSystemAssociationState struct {
	// Amazon Resource Name (ARN) of the newly created file system association.
	Arn pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of the storage used for the audit logs.
	AuditDestinationArn pulumi.StringPtrInput
	// Refresh cache information. see Cache Attributes for more details.
	CacheAttributes FileSystemAssociationCacheAttributesPtrInput
	// The Amazon Resource Name (ARN) of the gateway.
	GatewayArn pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
	LocationArn pulumi.StringPtrInput
	// The password of the user credential.
	Password pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The user name of the user credential that has permission to access the root share of the Amazon FSx file system. The user account must belong to the Amazon FSx delegated admin user group.
	Username pulumi.StringPtrInput
}

func (FileSystemAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*fileSystemAssociationState)(nil)).Elem()
}

type fileSystemAssociationArgs struct {
	// The Amazon Resource Name (ARN) of the storage used for the audit logs.
	AuditDestinationArn *string `pulumi:"auditDestinationArn"`
	// Refresh cache information. see Cache Attributes for more details.
	CacheAttributes *FileSystemAssociationCacheAttributes `pulumi:"cacheAttributes"`
	// The Amazon Resource Name (ARN) of the gateway.
	GatewayArn string `pulumi:"gatewayArn"`
	// The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
	LocationArn string `pulumi:"locationArn"`
	// The password of the user credential.
	Password string `pulumi:"password"`
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The user name of the user credential that has permission to access the root share of the Amazon FSx file system. The user account must belong to the Amazon FSx delegated admin user group.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a FileSystemAssociation resource.
type FileSystemAssociationArgs struct {
	// The Amazon Resource Name (ARN) of the storage used for the audit logs.
	AuditDestinationArn pulumi.StringPtrInput
	// Refresh cache information. see Cache Attributes for more details.
	CacheAttributes FileSystemAssociationCacheAttributesPtrInput
	// The Amazon Resource Name (ARN) of the gateway.
	GatewayArn pulumi.StringInput
	// The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
	LocationArn pulumi.StringInput
	// The password of the user credential.
	Password pulumi.StringInput
	// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The user name of the user credential that has permission to access the root share of the Amazon FSx file system. The user account must belong to the Amazon FSx delegated admin user group.
	Username pulumi.StringInput
}

func (FileSystemAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*fileSystemAssociationArgs)(nil)).Elem()
}

type FileSystemAssociationInput interface {
	pulumi.Input

	ToFileSystemAssociationOutput() FileSystemAssociationOutput
	ToFileSystemAssociationOutputWithContext(ctx context.Context) FileSystemAssociationOutput
}

func (*FileSystemAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**FileSystemAssociation)(nil)).Elem()
}

func (i *FileSystemAssociation) ToFileSystemAssociationOutput() FileSystemAssociationOutput {
	return i.ToFileSystemAssociationOutputWithContext(context.Background())
}

func (i *FileSystemAssociation) ToFileSystemAssociationOutputWithContext(ctx context.Context) FileSystemAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileSystemAssociationOutput)
}

// FileSystemAssociationArrayInput is an input type that accepts FileSystemAssociationArray and FileSystemAssociationArrayOutput values.
// You can construct a concrete instance of `FileSystemAssociationArrayInput` via:
//
//	FileSystemAssociationArray{ FileSystemAssociationArgs{...} }
type FileSystemAssociationArrayInput interface {
	pulumi.Input

	ToFileSystemAssociationArrayOutput() FileSystemAssociationArrayOutput
	ToFileSystemAssociationArrayOutputWithContext(context.Context) FileSystemAssociationArrayOutput
}

type FileSystemAssociationArray []FileSystemAssociationInput

func (FileSystemAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FileSystemAssociation)(nil)).Elem()
}

func (i FileSystemAssociationArray) ToFileSystemAssociationArrayOutput() FileSystemAssociationArrayOutput {
	return i.ToFileSystemAssociationArrayOutputWithContext(context.Background())
}

func (i FileSystemAssociationArray) ToFileSystemAssociationArrayOutputWithContext(ctx context.Context) FileSystemAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileSystemAssociationArrayOutput)
}

// FileSystemAssociationMapInput is an input type that accepts FileSystemAssociationMap and FileSystemAssociationMapOutput values.
// You can construct a concrete instance of `FileSystemAssociationMapInput` via:
//
//	FileSystemAssociationMap{ "key": FileSystemAssociationArgs{...} }
type FileSystemAssociationMapInput interface {
	pulumi.Input

	ToFileSystemAssociationMapOutput() FileSystemAssociationMapOutput
	ToFileSystemAssociationMapOutputWithContext(context.Context) FileSystemAssociationMapOutput
}

type FileSystemAssociationMap map[string]FileSystemAssociationInput

func (FileSystemAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FileSystemAssociation)(nil)).Elem()
}

func (i FileSystemAssociationMap) ToFileSystemAssociationMapOutput() FileSystemAssociationMapOutput {
	return i.ToFileSystemAssociationMapOutputWithContext(context.Background())
}

func (i FileSystemAssociationMap) ToFileSystemAssociationMapOutputWithContext(ctx context.Context) FileSystemAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileSystemAssociationMapOutput)
}

type FileSystemAssociationOutput struct{ *pulumi.OutputState }

func (FileSystemAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FileSystemAssociation)(nil)).Elem()
}

func (o FileSystemAssociationOutput) ToFileSystemAssociationOutput() FileSystemAssociationOutput {
	return o
}

func (o FileSystemAssociationOutput) ToFileSystemAssociationOutputWithContext(ctx context.Context) FileSystemAssociationOutput {
	return o
}

// Amazon Resource Name (ARN) of the newly created file system association.
func (o FileSystemAssociationOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *FileSystemAssociation) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) of the storage used for the audit logs.
func (o FileSystemAssociationOutput) AuditDestinationArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileSystemAssociation) pulumi.StringPtrOutput { return v.AuditDestinationArn }).(pulumi.StringPtrOutput)
}

// Refresh cache information. see Cache Attributes for more details.
func (o FileSystemAssociationOutput) CacheAttributes() FileSystemAssociationCacheAttributesPtrOutput {
	return o.ApplyT(func(v *FileSystemAssociation) FileSystemAssociationCacheAttributesPtrOutput { return v.CacheAttributes }).(FileSystemAssociationCacheAttributesPtrOutput)
}

// The Amazon Resource Name (ARN) of the gateway.
func (o FileSystemAssociationOutput) GatewayArn() pulumi.StringOutput {
	return o.ApplyT(func(v *FileSystemAssociation) pulumi.StringOutput { return v.GatewayArn }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) of the Amazon FSx file system to associate with the FSx File Gateway.
func (o FileSystemAssociationOutput) LocationArn() pulumi.StringOutput {
	return o.ApplyT(func(v *FileSystemAssociation) pulumi.StringOutput { return v.LocationArn }).(pulumi.StringOutput)
}

// The password of the user credential.
func (o FileSystemAssociationOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v *FileSystemAssociation) pulumi.StringOutput { return v.Password }).(pulumi.StringOutput)
}

// Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o FileSystemAssociationOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *FileSystemAssociation) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o FileSystemAssociationOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *FileSystemAssociation) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The user name of the user credential that has permission to access the root share of the Amazon FSx file system. The user account must belong to the Amazon FSx delegated admin user group.
func (o FileSystemAssociationOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *FileSystemAssociation) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type FileSystemAssociationArrayOutput struct{ *pulumi.OutputState }

func (FileSystemAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FileSystemAssociation)(nil)).Elem()
}

func (o FileSystemAssociationArrayOutput) ToFileSystemAssociationArrayOutput() FileSystemAssociationArrayOutput {
	return o
}

func (o FileSystemAssociationArrayOutput) ToFileSystemAssociationArrayOutputWithContext(ctx context.Context) FileSystemAssociationArrayOutput {
	return o
}

func (o FileSystemAssociationArrayOutput) Index(i pulumi.IntInput) FileSystemAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FileSystemAssociation {
		return vs[0].([]*FileSystemAssociation)[vs[1].(int)]
	}).(FileSystemAssociationOutput)
}

type FileSystemAssociationMapOutput struct{ *pulumi.OutputState }

func (FileSystemAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FileSystemAssociation)(nil)).Elem()
}

func (o FileSystemAssociationMapOutput) ToFileSystemAssociationMapOutput() FileSystemAssociationMapOutput {
	return o
}

func (o FileSystemAssociationMapOutput) ToFileSystemAssociationMapOutputWithContext(ctx context.Context) FileSystemAssociationMapOutput {
	return o
}

func (o FileSystemAssociationMapOutput) MapIndex(k pulumi.StringInput) FileSystemAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FileSystemAssociation {
		return vs[0].(map[string]*FileSystemAssociation)[vs[1].(string)]
	}).(FileSystemAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FileSystemAssociationInput)(nil)).Elem(), &FileSystemAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileSystemAssociationArrayInput)(nil)).Elem(), FileSystemAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileSystemAssociationMapInput)(nil)).Elem(), FileSystemAssociationMap{})
	pulumi.RegisterOutputType(FileSystemAssociationOutput{})
	pulumi.RegisterOutputType(FileSystemAssociationArrayOutput{})
	pulumi.RegisterOutputType(FileSystemAssociationMapOutput{})
}
