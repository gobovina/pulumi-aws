// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to create a new launch configuration, used for autoscaling groups.
//
// !> **WARNING:** The use of launch configurations is discouraged in favour of launch templates. Read more in the [AWS EC2 Documentation](https://docs.aws.amazon.com/autoscaling/ec2/userguide/launch-configurations.html).
//
// > **Note** When using `ec2.LaunchConfiguration` with `autoscaling.Group`, it is recommended to use the `namePrefix` (Optional) instead of the `name` (Optional) attribute.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ubuntu, err := ec2.LookupAmi(ctx, &ec2.LookupAmiArgs{
//				MostRecent: pulumi.BoolRef(true),
//				Filters: []ec2.GetAmiFilter{
//					{
//						Name: "name",
//						Values: []string{
//							"ubuntu/images/hvm-ssd/ubuntu-trusty-14.04-amd64-server-*",
//						},
//					},
//					{
//						Name: "virtualization-type",
//						Values: []string{
//							"hvm",
//						},
//					},
//				},
//				Owners: []string{
//					"099720109477",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = ec2.NewLaunchConfiguration(ctx, "as_conf", &ec2.LaunchConfigurationArgs{
//				Name:         pulumi.String("web_config"),
//				ImageId:      *pulumi.String(ubuntu.Id),
//				InstanceType: pulumi.String("t2.micro"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Using with AutoScaling Groups
//
// Launch Configurations cannot be updated after creation with the Amazon
// Web Service API. In order to update a Launch Configuration, this provider will
// destroy the existing resource and create a replacement. In order to effectively
// use a Launch Configuration resource with an AutoScaling Group resource,
// it's recommended to specify `createBeforeDestroy` in a lifecycle block.
// Either omit the Launch Configuration `name` attribute, or specify a partial name
// with `namePrefix`.  Example:
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/autoscaling"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ubuntu, err := ec2.LookupAmi(ctx, &ec2.LookupAmiArgs{
//				MostRecent: pulumi.BoolRef(true),
//				Filters: []ec2.GetAmiFilter{
//					{
//						Name: "name",
//						Values: []string{
//							"ubuntu/images/hvm-ssd/ubuntu-trusty-14.04-amd64-server-*",
//						},
//					},
//					{
//						Name: "virtualization-type",
//						Values: []string{
//							"hvm",
//						},
//					},
//				},
//				Owners: []string{
//					"099720109477",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			asConf, err := ec2.NewLaunchConfiguration(ctx, "as_conf", &ec2.LaunchConfigurationArgs{
//				NamePrefix:   pulumi.String("lc-example-"),
//				ImageId:      *pulumi.String(ubuntu.Id),
//				InstanceType: pulumi.String("t2.micro"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = autoscaling.NewGroup(ctx, "bar", &autoscaling.GroupArgs{
//				Name:                pulumi.String("asg-example"),
//				LaunchConfiguration: asConf.Name,
//				MinSize:             pulumi.Int(1),
//				MaxSize:             pulumi.Int(2),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// With this setup this provider generates a unique name for your Launch
// Configuration and can then update the AutoScaling Group without conflict before
// destroying the previous Launch Configuration.
//
// ## Using with Spot Instances
//
// Launch configurations can set the spot instance pricing to be used for the
// Auto Scaling Group to reserve instances. Simply specifying the `spotPrice`
// parameter will set the price on the Launch Configuration which will attempt to
// reserve your instances at this price.  See the [AWS Spot Instance
// documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html)
// for more information or how to launch [Spot Instances][3] with this provider.
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/autoscaling"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ubuntu, err := ec2.LookupAmi(ctx, &ec2.LookupAmiArgs{
//				MostRecent: pulumi.BoolRef(true),
//				Filters: []ec2.GetAmiFilter{
//					{
//						Name: "name",
//						Values: []string{
//							"ubuntu/images/hvm-ssd/ubuntu-trusty-14.04-amd64-server-*",
//						},
//					},
//					{
//						Name: "virtualization-type",
//						Values: []string{
//							"hvm",
//						},
//					},
//				},
//				Owners: []string{
//					"099720109477",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			asConf, err := ec2.NewLaunchConfiguration(ctx, "as_conf", &ec2.LaunchConfigurationArgs{
//				ImageId:      *pulumi.String(ubuntu.Id),
//				InstanceType: pulumi.String("m4.large"),
//				SpotPrice:    pulumi.String("0.001"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = autoscaling.NewGroup(ctx, "bar", &autoscaling.GroupArgs{
//				Name:                pulumi.String("asg-example"),
//				LaunchConfiguration: asConf.Name,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Block devices
//
// Each of the `*_block_device` attributes controls a portion of the AWS
// Launch Configuration's "Block Device Mapping". It's a good idea to familiarize yourself with [AWS's Block Device
// Mapping docs](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html)
// to understand the implications of using these attributes.
//
// Each AWS Instance type has a different set of Instance Store block devices
// available for attachment. AWS [publishes a
// list](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#StorageOnInstanceTypes)
// of which ephemeral devices are available on each type. The devices are always
// identified by the `virtualName` in the format `ephemeral{0..N}`.
//
// > **NOTE:** Changes to `*_block_device` configuration of _existing_ resources
// cannot currently be detected by this provider. After updating to block device
// configuration, resource recreation can be manually triggered by using the
// [`up` command with the --replace argument](https://www.pulumi.com/docs/reference/cli/pulumi_up/).
//
// ### ebsBlockDevice
//
// Modifying any of the `ebsBlockDevice` settings requires resource replacement.
//
//   - `deviceName` - (Required) The name of the device to mount.
//   - `snapshotId` - (Optional) The Snapshot ID to mount.
//   - `volumeType` - (Optional) The type of volume. Can be `standard`, `gp2`, `gp3`, `st1`, `sc1` or `io1`.
//   - `volumeSize` - (Optional) The size of the volume in gigabytes.
//   - `iops` - (Optional) The amount of provisioned
//     [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
//     This must be set with a `volumeType` of `"io1"`.
//   - `throughput` - (Optional) The throughput (MiBps) to provision for a `gp3` volume.
//   - `deleteOnTermination` - (Optional) Whether the volume should be destroyed
//     on instance termination (Default: `true`).
//   - `encrypted` - (Optional) Whether the volume should be encrypted or not. Defaults to `false`.
//   - `noDevice` - (Optional) Whether the device in the block device mapping of the AMI is suppressed.
//
// ### ephemeralBlockDevice
//
// * `deviceName` - (Required) The name of the block device to mount on the instance.
// * `noDevice` - (Optional) Whether the device in the block device mapping of the AMI is suppressed.
// * `virtualName` - (Optional) The [Instance Store Device Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames).
//
// ### rootBlockDevice
//
// > Modifying any of the `rootBlockDevice` settings requires resource replacement.
//
// * `deleteOnTermination` - (Optional) Whether the volume should be destroyed on instance termination. Defaults to `true`.
// * `encrypted` - (Optional) Whether the volume should be encrypted or not. Defaults to `false`.
// * `iops` - (Optional) The amount of provisioned [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html). This must be set with a `volumeType` of `io1`.
// * `throughput` - (Optional) The throughput (MiBps) to provision for a `gp3` volume.
// * `volumeSize` - (Optional) The size of the volume in gigabytes.
// * `volumeType` - (Optional) The type of volume. Can be `standard`, `gp2`, `gp3`, `st1`, `sc1` or `io1`.
//
// ## Import
//
// Using `pulumi import`, import launch configurations using the `name`. For example:
//
// ```sh
// $ pulumi import aws:ec2/launchConfiguration:LaunchConfiguration as_conf pulumi-lg-123456
// ```
type LaunchConfiguration struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name of the launch configuration.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Associate a public ip address with an instance in a VPC.
	AssociatePublicIpAddress pulumi.BoolPtrOutput `pulumi:"associatePublicIpAddress"`
	// Additional EBS block devices to attach to the instance. See Block Devices below for details.
	EbsBlockDevices LaunchConfigurationEbsBlockDeviceArrayOutput `pulumi:"ebsBlockDevices"`
	// If true, the launched EC2 instance will be EBS-optimized.
	EbsOptimized pulumi.BoolOutput `pulumi:"ebsOptimized"`
	// Enables/disables detailed monitoring. This is enabled by default.
	EnableMonitoring pulumi.BoolPtrOutput `pulumi:"enableMonitoring"`
	// Customize Ephemeral (also known as "Instance Store") volumes on the instance. See Block Devices below for details.
	EphemeralBlockDevices LaunchConfigurationEphemeralBlockDeviceArrayOutput `pulumi:"ephemeralBlockDevices"`
	// The name attribute of the IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.StringPtrOutput `pulumi:"iamInstanceProfile"`
	// The EC2 image ID to launch.
	ImageId pulumi.StringOutput `pulumi:"imageId"`
	// The size of instance to launch.
	//
	// The following arguments are optional:
	InstanceType pulumi.StringOutput `pulumi:"instanceType"`
	// The key name that should be used for the instance.
	KeyName pulumi.StringOutput `pulumi:"keyName"`
	// The metadata options for the instance.
	MetadataOptions LaunchConfigurationMetadataOptionsOutput `pulumi:"metadataOptions"`
	// The name of the launch configuration. If you leave this blank, this provider will auto-generate a unique name. Conflicts with `namePrefix`.
	Name pulumi.StringOutput `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringOutput `pulumi:"namePrefix"`
	// The tenancy of the instance. Valid values are `default` or `dedicated`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html) for more details.
	PlacementTenancy pulumi.StringPtrOutput `pulumi:"placementTenancy"`
	// Customize details about the root block device of the instance. See Block Devices below for details.
	RootBlockDevice LaunchConfigurationRootBlockDeviceOutput `pulumi:"rootBlockDevice"`
	// A list of associated security group IDS.
	SecurityGroups pulumi.StringArrayOutput `pulumi:"securityGroups"`
	// The maximum price to use for reserving spot instances.
	SpotPrice pulumi.StringPtrOutput `pulumi:"spotPrice"`
	// The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
	UserData pulumi.StringPtrOutput `pulumi:"userData"`
	// Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
	UserDataBase64 pulumi.StringPtrOutput `pulumi:"userDataBase64"`
}

// NewLaunchConfiguration registers a new resource with the given unique name, arguments, and options.
func NewLaunchConfiguration(ctx *pulumi.Context,
	name string, args *LaunchConfigurationArgs, opts ...pulumi.ResourceOption) (*LaunchConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ImageId == nil {
		return nil, errors.New("invalid value for required argument 'ImageId'")
	}
	if args.InstanceType == nil {
		return nil, errors.New("invalid value for required argument 'InstanceType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LaunchConfiguration
	err := ctx.RegisterResource("aws:ec2/launchConfiguration:LaunchConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLaunchConfiguration gets an existing LaunchConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLaunchConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LaunchConfigurationState, opts ...pulumi.ResourceOption) (*LaunchConfiguration, error) {
	var resource LaunchConfiguration
	err := ctx.ReadResource("aws:ec2/launchConfiguration:LaunchConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LaunchConfiguration resources.
type launchConfigurationState struct {
	// The Amazon Resource Name of the launch configuration.
	Arn *string `pulumi:"arn"`
	// Associate a public ip address with an instance in a VPC.
	AssociatePublicIpAddress *bool `pulumi:"associatePublicIpAddress"`
	// Additional EBS block devices to attach to the instance. See Block Devices below for details.
	EbsBlockDevices []LaunchConfigurationEbsBlockDevice `pulumi:"ebsBlockDevices"`
	// If true, the launched EC2 instance will be EBS-optimized.
	EbsOptimized *bool `pulumi:"ebsOptimized"`
	// Enables/disables detailed monitoring. This is enabled by default.
	EnableMonitoring *bool `pulumi:"enableMonitoring"`
	// Customize Ephemeral (also known as "Instance Store") volumes on the instance. See Block Devices below for details.
	EphemeralBlockDevices []LaunchConfigurationEphemeralBlockDevice `pulumi:"ephemeralBlockDevices"`
	// The name attribute of the IAM instance profile to associate with launched instances.
	IamInstanceProfile interface{} `pulumi:"iamInstanceProfile"`
	// The EC2 image ID to launch.
	ImageId *string `pulumi:"imageId"`
	// The size of instance to launch.
	//
	// The following arguments are optional:
	InstanceType *string `pulumi:"instanceType"`
	// The key name that should be used for the instance.
	KeyName *string `pulumi:"keyName"`
	// The metadata options for the instance.
	MetadataOptions *LaunchConfigurationMetadataOptions `pulumi:"metadataOptions"`
	// The name of the launch configuration. If you leave this blank, this provider will auto-generate a unique name. Conflicts with `namePrefix`.
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// The tenancy of the instance. Valid values are `default` or `dedicated`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html) for more details.
	PlacementTenancy *string `pulumi:"placementTenancy"`
	// Customize details about the root block device of the instance. See Block Devices below for details.
	RootBlockDevice *LaunchConfigurationRootBlockDevice `pulumi:"rootBlockDevice"`
	// A list of associated security group IDS.
	SecurityGroups []string `pulumi:"securityGroups"`
	// The maximum price to use for reserving spot instances.
	SpotPrice *string `pulumi:"spotPrice"`
	// The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
	UserData *string `pulumi:"userData"`
	// Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
	UserDataBase64 *string `pulumi:"userDataBase64"`
}

type LaunchConfigurationState struct {
	// The Amazon Resource Name of the launch configuration.
	Arn pulumi.StringPtrInput
	// Associate a public ip address with an instance in a VPC.
	AssociatePublicIpAddress pulumi.BoolPtrInput
	// Additional EBS block devices to attach to the instance. See Block Devices below for details.
	EbsBlockDevices LaunchConfigurationEbsBlockDeviceArrayInput
	// If true, the launched EC2 instance will be EBS-optimized.
	EbsOptimized pulumi.BoolPtrInput
	// Enables/disables detailed monitoring. This is enabled by default.
	EnableMonitoring pulumi.BoolPtrInput
	// Customize Ephemeral (also known as "Instance Store") volumes on the instance. See Block Devices below for details.
	EphemeralBlockDevices LaunchConfigurationEphemeralBlockDeviceArrayInput
	// The name attribute of the IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.Input
	// The EC2 image ID to launch.
	ImageId pulumi.StringPtrInput
	// The size of instance to launch.
	//
	// The following arguments are optional:
	InstanceType pulumi.StringPtrInput
	// The key name that should be used for the instance.
	KeyName pulumi.StringPtrInput
	// The metadata options for the instance.
	MetadataOptions LaunchConfigurationMetadataOptionsPtrInput
	// The name of the launch configuration. If you leave this blank, this provider will auto-generate a unique name. Conflicts with `namePrefix`.
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// The tenancy of the instance. Valid values are `default` or `dedicated`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html) for more details.
	PlacementTenancy pulumi.StringPtrInput
	// Customize details about the root block device of the instance. See Block Devices below for details.
	RootBlockDevice LaunchConfigurationRootBlockDevicePtrInput
	// A list of associated security group IDS.
	SecurityGroups pulumi.StringArrayInput
	// The maximum price to use for reserving spot instances.
	SpotPrice pulumi.StringPtrInput
	// The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
	UserData pulumi.StringPtrInput
	// Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
	UserDataBase64 pulumi.StringPtrInput
}

func (LaunchConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*launchConfigurationState)(nil)).Elem()
}

type launchConfigurationArgs struct {
	// Associate a public ip address with an instance in a VPC.
	AssociatePublicIpAddress *bool `pulumi:"associatePublicIpAddress"`
	// Additional EBS block devices to attach to the instance. See Block Devices below for details.
	EbsBlockDevices []LaunchConfigurationEbsBlockDevice `pulumi:"ebsBlockDevices"`
	// If true, the launched EC2 instance will be EBS-optimized.
	EbsOptimized *bool `pulumi:"ebsOptimized"`
	// Enables/disables detailed monitoring. This is enabled by default.
	EnableMonitoring *bool `pulumi:"enableMonitoring"`
	// Customize Ephemeral (also known as "Instance Store") volumes on the instance. See Block Devices below for details.
	EphemeralBlockDevices []LaunchConfigurationEphemeralBlockDevice `pulumi:"ephemeralBlockDevices"`
	// The name attribute of the IAM instance profile to associate with launched instances.
	IamInstanceProfile interface{} `pulumi:"iamInstanceProfile"`
	// The EC2 image ID to launch.
	ImageId string `pulumi:"imageId"`
	// The size of instance to launch.
	//
	// The following arguments are optional:
	InstanceType string `pulumi:"instanceType"`
	// The key name that should be used for the instance.
	KeyName *string `pulumi:"keyName"`
	// The metadata options for the instance.
	MetadataOptions *LaunchConfigurationMetadataOptions `pulumi:"metadataOptions"`
	// The name of the launch configuration. If you leave this blank, this provider will auto-generate a unique name. Conflicts with `namePrefix`.
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// The tenancy of the instance. Valid values are `default` or `dedicated`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html) for more details.
	PlacementTenancy *string `pulumi:"placementTenancy"`
	// Customize details about the root block device of the instance. See Block Devices below for details.
	RootBlockDevice *LaunchConfigurationRootBlockDevice `pulumi:"rootBlockDevice"`
	// A list of associated security group IDS.
	SecurityGroups []string `pulumi:"securityGroups"`
	// The maximum price to use for reserving spot instances.
	SpotPrice *string `pulumi:"spotPrice"`
	// The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
	UserData *string `pulumi:"userData"`
	// Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
	UserDataBase64 *string `pulumi:"userDataBase64"`
}

// The set of arguments for constructing a LaunchConfiguration resource.
type LaunchConfigurationArgs struct {
	// Associate a public ip address with an instance in a VPC.
	AssociatePublicIpAddress pulumi.BoolPtrInput
	// Additional EBS block devices to attach to the instance. See Block Devices below for details.
	EbsBlockDevices LaunchConfigurationEbsBlockDeviceArrayInput
	// If true, the launched EC2 instance will be EBS-optimized.
	EbsOptimized pulumi.BoolPtrInput
	// Enables/disables detailed monitoring. This is enabled by default.
	EnableMonitoring pulumi.BoolPtrInput
	// Customize Ephemeral (also known as "Instance Store") volumes on the instance. See Block Devices below for details.
	EphemeralBlockDevices LaunchConfigurationEphemeralBlockDeviceArrayInput
	// The name attribute of the IAM instance profile to associate with launched instances.
	IamInstanceProfile pulumi.Input
	// The EC2 image ID to launch.
	ImageId pulumi.StringInput
	// The size of instance to launch.
	//
	// The following arguments are optional:
	InstanceType pulumi.StringInput
	// The key name that should be used for the instance.
	KeyName pulumi.StringPtrInput
	// The metadata options for the instance.
	MetadataOptions LaunchConfigurationMetadataOptionsPtrInput
	// The name of the launch configuration. If you leave this blank, this provider will auto-generate a unique name. Conflicts with `namePrefix`.
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// The tenancy of the instance. Valid values are `default` or `dedicated`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html) for more details.
	PlacementTenancy pulumi.StringPtrInput
	// Customize details about the root block device of the instance. See Block Devices below for details.
	RootBlockDevice LaunchConfigurationRootBlockDevicePtrInput
	// A list of associated security group IDS.
	SecurityGroups pulumi.StringArrayInput
	// The maximum price to use for reserving spot instances.
	SpotPrice pulumi.StringPtrInput
	// The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
	UserData pulumi.StringPtrInput
	// Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
	UserDataBase64 pulumi.StringPtrInput
}

func (LaunchConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*launchConfigurationArgs)(nil)).Elem()
}

type LaunchConfigurationInput interface {
	pulumi.Input

	ToLaunchConfigurationOutput() LaunchConfigurationOutput
	ToLaunchConfigurationOutputWithContext(ctx context.Context) LaunchConfigurationOutput
}

func (*LaunchConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**LaunchConfiguration)(nil)).Elem()
}

func (i *LaunchConfiguration) ToLaunchConfigurationOutput() LaunchConfigurationOutput {
	return i.ToLaunchConfigurationOutputWithContext(context.Background())
}

func (i *LaunchConfiguration) ToLaunchConfigurationOutputWithContext(ctx context.Context) LaunchConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LaunchConfigurationOutput)
}

// LaunchConfigurationArrayInput is an input type that accepts LaunchConfigurationArray and LaunchConfigurationArrayOutput values.
// You can construct a concrete instance of `LaunchConfigurationArrayInput` via:
//
//	LaunchConfigurationArray{ LaunchConfigurationArgs{...} }
type LaunchConfigurationArrayInput interface {
	pulumi.Input

	ToLaunchConfigurationArrayOutput() LaunchConfigurationArrayOutput
	ToLaunchConfigurationArrayOutputWithContext(context.Context) LaunchConfigurationArrayOutput
}

type LaunchConfigurationArray []LaunchConfigurationInput

func (LaunchConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LaunchConfiguration)(nil)).Elem()
}

func (i LaunchConfigurationArray) ToLaunchConfigurationArrayOutput() LaunchConfigurationArrayOutput {
	return i.ToLaunchConfigurationArrayOutputWithContext(context.Background())
}

func (i LaunchConfigurationArray) ToLaunchConfigurationArrayOutputWithContext(ctx context.Context) LaunchConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LaunchConfigurationArrayOutput)
}

// LaunchConfigurationMapInput is an input type that accepts LaunchConfigurationMap and LaunchConfigurationMapOutput values.
// You can construct a concrete instance of `LaunchConfigurationMapInput` via:
//
//	LaunchConfigurationMap{ "key": LaunchConfigurationArgs{...} }
type LaunchConfigurationMapInput interface {
	pulumi.Input

	ToLaunchConfigurationMapOutput() LaunchConfigurationMapOutput
	ToLaunchConfigurationMapOutputWithContext(context.Context) LaunchConfigurationMapOutput
}

type LaunchConfigurationMap map[string]LaunchConfigurationInput

func (LaunchConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LaunchConfiguration)(nil)).Elem()
}

func (i LaunchConfigurationMap) ToLaunchConfigurationMapOutput() LaunchConfigurationMapOutput {
	return i.ToLaunchConfigurationMapOutputWithContext(context.Background())
}

func (i LaunchConfigurationMap) ToLaunchConfigurationMapOutputWithContext(ctx context.Context) LaunchConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LaunchConfigurationMapOutput)
}

type LaunchConfigurationOutput struct{ *pulumi.OutputState }

func (LaunchConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LaunchConfiguration)(nil)).Elem()
}

func (o LaunchConfigurationOutput) ToLaunchConfigurationOutput() LaunchConfigurationOutput {
	return o
}

func (o LaunchConfigurationOutput) ToLaunchConfigurationOutputWithContext(ctx context.Context) LaunchConfigurationOutput {
	return o
}

// The Amazon Resource Name of the launch configuration.
func (o LaunchConfigurationOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Associate a public ip address with an instance in a VPC.
func (o LaunchConfigurationOutput) AssociatePublicIpAddress() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.BoolPtrOutput { return v.AssociatePublicIpAddress }).(pulumi.BoolPtrOutput)
}

// Additional EBS block devices to attach to the instance. See Block Devices below for details.
func (o LaunchConfigurationOutput) EbsBlockDevices() LaunchConfigurationEbsBlockDeviceArrayOutput {
	return o.ApplyT(func(v *LaunchConfiguration) LaunchConfigurationEbsBlockDeviceArrayOutput { return v.EbsBlockDevices }).(LaunchConfigurationEbsBlockDeviceArrayOutput)
}

// If true, the launched EC2 instance will be EBS-optimized.
func (o LaunchConfigurationOutput) EbsOptimized() pulumi.BoolOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.BoolOutput { return v.EbsOptimized }).(pulumi.BoolOutput)
}

// Enables/disables detailed monitoring. This is enabled by default.
func (o LaunchConfigurationOutput) EnableMonitoring() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.BoolPtrOutput { return v.EnableMonitoring }).(pulumi.BoolPtrOutput)
}

// Customize Ephemeral (also known as "Instance Store") volumes on the instance. See Block Devices below for details.
func (o LaunchConfigurationOutput) EphemeralBlockDevices() LaunchConfigurationEphemeralBlockDeviceArrayOutput {
	return o.ApplyT(func(v *LaunchConfiguration) LaunchConfigurationEphemeralBlockDeviceArrayOutput {
		return v.EphemeralBlockDevices
	}).(LaunchConfigurationEphemeralBlockDeviceArrayOutput)
}

// The name attribute of the IAM instance profile to associate with launched instances.
func (o LaunchConfigurationOutput) IamInstanceProfile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.StringPtrOutput { return v.IamInstanceProfile }).(pulumi.StringPtrOutput)
}

// The EC2 image ID to launch.
func (o LaunchConfigurationOutput) ImageId() pulumi.StringOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.StringOutput { return v.ImageId }).(pulumi.StringOutput)
}

// The size of instance to launch.
//
// The following arguments are optional:
func (o LaunchConfigurationOutput) InstanceType() pulumi.StringOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.StringOutput { return v.InstanceType }).(pulumi.StringOutput)
}

// The key name that should be used for the instance.
func (o LaunchConfigurationOutput) KeyName() pulumi.StringOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.StringOutput { return v.KeyName }).(pulumi.StringOutput)
}

// The metadata options for the instance.
func (o LaunchConfigurationOutput) MetadataOptions() LaunchConfigurationMetadataOptionsOutput {
	return o.ApplyT(func(v *LaunchConfiguration) LaunchConfigurationMetadataOptionsOutput { return v.MetadataOptions }).(LaunchConfigurationMetadataOptionsOutput)
}

// The name of the launch configuration. If you leave this blank, this provider will auto-generate a unique name. Conflicts with `namePrefix`.
func (o LaunchConfigurationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
func (o LaunchConfigurationOutput) NamePrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.StringOutput { return v.NamePrefix }).(pulumi.StringOutput)
}

// The tenancy of the instance. Valid values are `default` or `dedicated`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html) for more details.
func (o LaunchConfigurationOutput) PlacementTenancy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.StringPtrOutput { return v.PlacementTenancy }).(pulumi.StringPtrOutput)
}

// Customize details about the root block device of the instance. See Block Devices below for details.
func (o LaunchConfigurationOutput) RootBlockDevice() LaunchConfigurationRootBlockDeviceOutput {
	return o.ApplyT(func(v *LaunchConfiguration) LaunchConfigurationRootBlockDeviceOutput { return v.RootBlockDevice }).(LaunchConfigurationRootBlockDeviceOutput)
}

// A list of associated security group IDS.
func (o LaunchConfigurationOutput) SecurityGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.StringArrayOutput { return v.SecurityGroups }).(pulumi.StringArrayOutput)
}

// The maximum price to use for reserving spot instances.
func (o LaunchConfigurationOutput) SpotPrice() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.StringPtrOutput { return v.SpotPrice }).(pulumi.StringPtrOutput)
}

// The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `userDataBase64` instead.
func (o LaunchConfigurationOutput) UserData() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.StringPtrOutput { return v.UserData }).(pulumi.StringPtrOutput)
}

// Can be used instead of `userData` to pass base64-encoded binary data directly. Use this instead of `userData` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
func (o LaunchConfigurationOutput) UserDataBase64() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LaunchConfiguration) pulumi.StringPtrOutput { return v.UserDataBase64 }).(pulumi.StringPtrOutput)
}

type LaunchConfigurationArrayOutput struct{ *pulumi.OutputState }

func (LaunchConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LaunchConfiguration)(nil)).Elem()
}

func (o LaunchConfigurationArrayOutput) ToLaunchConfigurationArrayOutput() LaunchConfigurationArrayOutput {
	return o
}

func (o LaunchConfigurationArrayOutput) ToLaunchConfigurationArrayOutputWithContext(ctx context.Context) LaunchConfigurationArrayOutput {
	return o
}

func (o LaunchConfigurationArrayOutput) Index(i pulumi.IntInput) LaunchConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LaunchConfiguration {
		return vs[0].([]*LaunchConfiguration)[vs[1].(int)]
	}).(LaunchConfigurationOutput)
}

type LaunchConfigurationMapOutput struct{ *pulumi.OutputState }

func (LaunchConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LaunchConfiguration)(nil)).Elem()
}

func (o LaunchConfigurationMapOutput) ToLaunchConfigurationMapOutput() LaunchConfigurationMapOutput {
	return o
}

func (o LaunchConfigurationMapOutput) ToLaunchConfigurationMapOutputWithContext(ctx context.Context) LaunchConfigurationMapOutput {
	return o
}

func (o LaunchConfigurationMapOutput) MapIndex(k pulumi.StringInput) LaunchConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LaunchConfiguration {
		return vs[0].(map[string]*LaunchConfiguration)[vs[1].(string)]
	}).(LaunchConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LaunchConfigurationInput)(nil)).Elem(), &LaunchConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*LaunchConfigurationArrayInput)(nil)).Elem(), LaunchConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LaunchConfigurationMapInput)(nil)).Elem(), LaunchConfigurationMap{})
	pulumi.RegisterOutputType(LaunchConfigurationOutput{})
	pulumi.RegisterOutputType(LaunchConfigurationArrayOutput{})
	pulumi.RegisterOutputType(LaunchConfigurationMapOutput{})
}
