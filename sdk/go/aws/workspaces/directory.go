// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package workspaces

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a WorkSpaces directory in AWS WorkSpaces Service.
//
// > **NOTE:** AWS WorkSpaces service requires [`workspaces_DefaultRole`](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role) IAM role to operate normally.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/directoryservice"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ec2"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/iam"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/workspaces"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			workspaces, err := iam.GetPolicyDocument(ctx, &iam.GetPolicyDocumentArgs{
//				Statements: []iam.GetPolicyDocumentStatement{
//					{
//						Actions: []string{
//							"sts:AssumeRole",
//						},
//						Principals: []iam.GetPolicyDocumentStatementPrincipal{
//							{
//								Type: "Service",
//								Identifiers: []string{
//									"workspaces.amazonaws.com",
//								},
//							},
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			workspacesDefault, err := iam.NewRole(ctx, "workspacesDefault", &iam.RoleArgs{
//				AssumeRolePolicy: *pulumi.String(workspaces.Json),
//			})
//			if err != nil {
//				return err
//			}
//			workspacesDefaultServiceAccess, err := iam.NewRolePolicyAttachment(ctx, "workspacesDefaultServiceAccess", &iam.RolePolicyAttachmentArgs{
//				Role:      workspacesDefault.Name,
//				PolicyArn: pulumi.String("arn:aws:iam::aws:policy/AmazonWorkSpacesServiceAccess"),
//			})
//			if err != nil {
//				return err
//			}
//			workspacesDefaultSelfServiceAccess, err := iam.NewRolePolicyAttachment(ctx, "workspacesDefaultSelfServiceAccess", &iam.RolePolicyAttachmentArgs{
//				Role:      workspacesDefault.Name,
//				PolicyArn: pulumi.String("arn:aws:iam::aws:policy/AmazonWorkSpacesSelfServiceAccess"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleVpc, err := ec2.NewVpc(ctx, "exampleVpc", &ec2.VpcArgs{
//				CidrBlock: pulumi.String("10.0.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleC, err := ec2.NewSubnet(ctx, "exampleC", &ec2.SubnetArgs{
//				VpcId:            exampleVpc.ID(),
//				AvailabilityZone: pulumi.String("us-east-1c"),
//				CidrBlock:        pulumi.String("10.0.2.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleD, err := ec2.NewSubnet(ctx, "exampleD", &ec2.SubnetArgs{
//				VpcId:            exampleVpc.ID(),
//				AvailabilityZone: pulumi.String("us-east-1d"),
//				CidrBlock:        pulumi.String("10.0.3.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = workspaces.NewDirectory(ctx, "exampleDirectory", &workspaces.DirectoryArgs{
//				DirectoryId: exampleDirectoryservice / directoryDirectory.Id,
//				SubnetIds: pulumi.StringArray{
//					exampleC.ID(),
//					exampleD.ID(),
//				},
//				Tags: pulumi.StringMap{
//					"Example": pulumi.String("true"),
//				},
//				SelfServicePermissions: &workspaces.DirectorySelfServicePermissionsArgs{
//					ChangeComputeType:  pulumi.Bool(true),
//					IncreaseVolumeSize: pulumi.Bool(true),
//					RebuildWorkspace:   pulumi.Bool(true),
//					RestartWorkspace:   pulumi.Bool(true),
//					SwitchRunningMode:  pulumi.Bool(true),
//				},
//				WorkspaceAccessProperties: &workspaces.DirectoryWorkspaceAccessPropertiesArgs{
//					DeviceTypeAndroid:    pulumi.String("ALLOW"),
//					DeviceTypeChromeos:   pulumi.String("ALLOW"),
//					DeviceTypeIos:        pulumi.String("ALLOW"),
//					DeviceTypeLinux:      pulumi.String("DENY"),
//					DeviceTypeOsx:        pulumi.String("ALLOW"),
//					DeviceTypeWeb:        pulumi.String("DENY"),
//					DeviceTypeWindows:    pulumi.String("DENY"),
//					DeviceTypeZeroclient: pulumi.String("DENY"),
//				},
//				WorkspaceCreationProperties: &workspaces.DirectoryWorkspaceCreationPropertiesArgs{
//					CustomSecurityGroupId:           pulumi.Any(aws_security_group.Example.Id),
//					DefaultOu:                       pulumi.String("OU=AWS,DC=Workgroup,DC=Example,DC=com"),
//					EnableInternetAccess:            pulumi.Bool(true),
//					EnableMaintenanceMode:           pulumi.Bool(true),
//					UserEnabledAsLocalAdministrator: pulumi.Bool(true),
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				workspacesDefaultServiceAccess,
//				workspacesDefaultSelfServiceAccess,
//			}))
//			if err != nil {
//				return err
//			}
//			exampleA, err := ec2.NewSubnet(ctx, "exampleA", &ec2.SubnetArgs{
//				VpcId:            exampleVpc.ID(),
//				AvailabilityZone: pulumi.String("us-east-1a"),
//				CidrBlock:        pulumi.String("10.0.0.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleB, err := ec2.NewSubnet(ctx, "exampleB", &ec2.SubnetArgs{
//				VpcId:            exampleVpc.ID(),
//				AvailabilityZone: pulumi.String("us-east-1b"),
//				CidrBlock:        pulumi.String("10.0.1.0/24"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = directoryservice.NewDirectory(ctx, "exampleDirectoryservice/directoryDirectory", &directoryservice.DirectoryArgs{
//				Name:     pulumi.String("corp.example.com"),
//				Password: pulumi.String("#S1ncerely"),
//				Size:     pulumi.String("Small"),
//				VpcSettings: &directoryservice.DirectoryVpcSettingsArgs{
//					VpcId: exampleVpc.ID(),
//					SubnetIds: pulumi.StringArray{
//						exampleA.ID(),
//						exampleB.ID(),
//					},
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
// ### IP Groups
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/workspaces"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleIpGroup, err := workspaces.NewIpGroup(ctx, "exampleIpGroup", nil)
//			if err != nil {
//				return err
//			}
//			_, err = workspaces.NewDirectory(ctx, "exampleDirectory", &workspaces.DirectoryArgs{
//				DirectoryId: pulumi.Any(aws_directory_service_directory.Example.Id),
//				IpGroupIds: pulumi.StringArray{
//					exampleIpGroup.ID(),
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
// Using `pulumi import`, import Workspaces directory using the directory ID. For example:
//
// ```sh
//
//	$ pulumi import aws:workspaces/directory:Directory main d-4444444444
//
// ```
type Directory struct {
	pulumi.CustomResourceState

	// The directory alias.
	Alias pulumi.StringOutput `pulumi:"alias"`
	// The user name for the service account.
	CustomerUserName pulumi.StringOutput `pulumi:"customerUserName"`
	// The directory identifier for registration in WorkSpaces service.
	DirectoryId pulumi.StringOutput `pulumi:"directoryId"`
	// The name of the directory.
	DirectoryName pulumi.StringOutput `pulumi:"directoryName"`
	// The directory type.
	DirectoryType pulumi.StringOutput `pulumi:"directoryType"`
	// The IP addresses of the DNS servers for the directory.
	DnsIpAddresses pulumi.StringArrayOutput `pulumi:"dnsIpAddresses"`
	// The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
	IamRoleId pulumi.StringOutput `pulumi:"iamRoleId"`
	// The identifiers of the IP access control groups associated with the directory.
	IpGroupIds pulumi.StringArrayOutput `pulumi:"ipGroupIds"`
	// The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
	RegistrationCode pulumi.StringOutput `pulumi:"registrationCode"`
	// Permissions to enable or disable self-service capabilities. Defined below.
	SelfServicePermissions DirectorySelfServicePermissionsOutput `pulumi:"selfServicePermissions"`
	// The identifiers of the subnets where the directory resides.
	SubnetIds pulumi.StringArrayOutput `pulumi:"subnetIds"`
	// A map of tags assigned to the WorkSpaces directory. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
	WorkspaceAccessProperties DirectoryWorkspaceAccessPropertiesOutput `pulumi:"workspaceAccessProperties"`
	// Default properties that are used for creating WorkSpaces. Defined below.
	WorkspaceCreationProperties DirectoryWorkspaceCreationPropertiesOutput `pulumi:"workspaceCreationProperties"`
	// The identifier of the security group that is assigned to new WorkSpaces.
	WorkspaceSecurityGroupId pulumi.StringOutput `pulumi:"workspaceSecurityGroupId"`
}

// NewDirectory registers a new resource with the given unique name, arguments, and options.
func NewDirectory(ctx *pulumi.Context,
	name string, args *DirectoryArgs, opts ...pulumi.ResourceOption) (*Directory, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DirectoryId == nil {
		return nil, errors.New("invalid value for required argument 'DirectoryId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Directory
	err := ctx.RegisterResource("aws:workspaces/directory:Directory", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDirectory gets an existing Directory resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDirectory(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DirectoryState, opts ...pulumi.ResourceOption) (*Directory, error) {
	var resource Directory
	err := ctx.ReadResource("aws:workspaces/directory:Directory", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Directory resources.
type directoryState struct {
	// The directory alias.
	Alias *string `pulumi:"alias"`
	// The user name for the service account.
	CustomerUserName *string `pulumi:"customerUserName"`
	// The directory identifier for registration in WorkSpaces service.
	DirectoryId *string `pulumi:"directoryId"`
	// The name of the directory.
	DirectoryName *string `pulumi:"directoryName"`
	// The directory type.
	DirectoryType *string `pulumi:"directoryType"`
	// The IP addresses of the DNS servers for the directory.
	DnsIpAddresses []string `pulumi:"dnsIpAddresses"`
	// The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
	IamRoleId *string `pulumi:"iamRoleId"`
	// The identifiers of the IP access control groups associated with the directory.
	IpGroupIds []string `pulumi:"ipGroupIds"`
	// The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
	RegistrationCode *string `pulumi:"registrationCode"`
	// Permissions to enable or disable self-service capabilities. Defined below.
	SelfServicePermissions *DirectorySelfServicePermissions `pulumi:"selfServicePermissions"`
	// The identifiers of the subnets where the directory resides.
	SubnetIds []string `pulumi:"subnetIds"`
	// A map of tags assigned to the WorkSpaces directory. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
	WorkspaceAccessProperties *DirectoryWorkspaceAccessProperties `pulumi:"workspaceAccessProperties"`
	// Default properties that are used for creating WorkSpaces. Defined below.
	WorkspaceCreationProperties *DirectoryWorkspaceCreationProperties `pulumi:"workspaceCreationProperties"`
	// The identifier of the security group that is assigned to new WorkSpaces.
	WorkspaceSecurityGroupId *string `pulumi:"workspaceSecurityGroupId"`
}

type DirectoryState struct {
	// The directory alias.
	Alias pulumi.StringPtrInput
	// The user name for the service account.
	CustomerUserName pulumi.StringPtrInput
	// The directory identifier for registration in WorkSpaces service.
	DirectoryId pulumi.StringPtrInput
	// The name of the directory.
	DirectoryName pulumi.StringPtrInput
	// The directory type.
	DirectoryType pulumi.StringPtrInput
	// The IP addresses of the DNS servers for the directory.
	DnsIpAddresses pulumi.StringArrayInput
	// The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
	IamRoleId pulumi.StringPtrInput
	// The identifiers of the IP access control groups associated with the directory.
	IpGroupIds pulumi.StringArrayInput
	// The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
	RegistrationCode pulumi.StringPtrInput
	// Permissions to enable or disable self-service capabilities. Defined below.
	SelfServicePermissions DirectorySelfServicePermissionsPtrInput
	// The identifiers of the subnets where the directory resides.
	SubnetIds pulumi.StringArrayInput
	// A map of tags assigned to the WorkSpaces directory. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
	WorkspaceAccessProperties DirectoryWorkspaceAccessPropertiesPtrInput
	// Default properties that are used for creating WorkSpaces. Defined below.
	WorkspaceCreationProperties DirectoryWorkspaceCreationPropertiesPtrInput
	// The identifier of the security group that is assigned to new WorkSpaces.
	WorkspaceSecurityGroupId pulumi.StringPtrInput
}

func (DirectoryState) ElementType() reflect.Type {
	return reflect.TypeOf((*directoryState)(nil)).Elem()
}

type directoryArgs struct {
	// The directory identifier for registration in WorkSpaces service.
	DirectoryId string `pulumi:"directoryId"`
	// The identifiers of the IP access control groups associated with the directory.
	IpGroupIds []string `pulumi:"ipGroupIds"`
	// Permissions to enable or disable self-service capabilities. Defined below.
	SelfServicePermissions *DirectorySelfServicePermissions `pulumi:"selfServicePermissions"`
	// The identifiers of the subnets where the directory resides.
	SubnetIds []string `pulumi:"subnetIds"`
	// A map of tags assigned to the WorkSpaces directory. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
	WorkspaceAccessProperties *DirectoryWorkspaceAccessProperties `pulumi:"workspaceAccessProperties"`
	// Default properties that are used for creating WorkSpaces. Defined below.
	WorkspaceCreationProperties *DirectoryWorkspaceCreationProperties `pulumi:"workspaceCreationProperties"`
}

// The set of arguments for constructing a Directory resource.
type DirectoryArgs struct {
	// The directory identifier for registration in WorkSpaces service.
	DirectoryId pulumi.StringInput
	// The identifiers of the IP access control groups associated with the directory.
	IpGroupIds pulumi.StringArrayInput
	// Permissions to enable or disable self-service capabilities. Defined below.
	SelfServicePermissions DirectorySelfServicePermissionsPtrInput
	// The identifiers of the subnets where the directory resides.
	SubnetIds pulumi.StringArrayInput
	// A map of tags assigned to the WorkSpaces directory. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
	WorkspaceAccessProperties DirectoryWorkspaceAccessPropertiesPtrInput
	// Default properties that are used for creating WorkSpaces. Defined below.
	WorkspaceCreationProperties DirectoryWorkspaceCreationPropertiesPtrInput
}

func (DirectoryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*directoryArgs)(nil)).Elem()
}

type DirectoryInput interface {
	pulumi.Input

	ToDirectoryOutput() DirectoryOutput
	ToDirectoryOutputWithContext(ctx context.Context) DirectoryOutput
}

func (*Directory) ElementType() reflect.Type {
	return reflect.TypeOf((**Directory)(nil)).Elem()
}

func (i *Directory) ToDirectoryOutput() DirectoryOutput {
	return i.ToDirectoryOutputWithContext(context.Background())
}

func (i *Directory) ToDirectoryOutputWithContext(ctx context.Context) DirectoryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DirectoryOutput)
}

// DirectoryArrayInput is an input type that accepts DirectoryArray and DirectoryArrayOutput values.
// You can construct a concrete instance of `DirectoryArrayInput` via:
//
//	DirectoryArray{ DirectoryArgs{...} }
type DirectoryArrayInput interface {
	pulumi.Input

	ToDirectoryArrayOutput() DirectoryArrayOutput
	ToDirectoryArrayOutputWithContext(context.Context) DirectoryArrayOutput
}

type DirectoryArray []DirectoryInput

func (DirectoryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Directory)(nil)).Elem()
}

func (i DirectoryArray) ToDirectoryArrayOutput() DirectoryArrayOutput {
	return i.ToDirectoryArrayOutputWithContext(context.Background())
}

func (i DirectoryArray) ToDirectoryArrayOutputWithContext(ctx context.Context) DirectoryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DirectoryArrayOutput)
}

// DirectoryMapInput is an input type that accepts DirectoryMap and DirectoryMapOutput values.
// You can construct a concrete instance of `DirectoryMapInput` via:
//
//	DirectoryMap{ "key": DirectoryArgs{...} }
type DirectoryMapInput interface {
	pulumi.Input

	ToDirectoryMapOutput() DirectoryMapOutput
	ToDirectoryMapOutputWithContext(context.Context) DirectoryMapOutput
}

type DirectoryMap map[string]DirectoryInput

func (DirectoryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Directory)(nil)).Elem()
}

func (i DirectoryMap) ToDirectoryMapOutput() DirectoryMapOutput {
	return i.ToDirectoryMapOutputWithContext(context.Background())
}

func (i DirectoryMap) ToDirectoryMapOutputWithContext(ctx context.Context) DirectoryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DirectoryMapOutput)
}

type DirectoryOutput struct{ *pulumi.OutputState }

func (DirectoryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Directory)(nil)).Elem()
}

func (o DirectoryOutput) ToDirectoryOutput() DirectoryOutput {
	return o
}

func (o DirectoryOutput) ToDirectoryOutputWithContext(ctx context.Context) DirectoryOutput {
	return o
}

// The directory alias.
func (o DirectoryOutput) Alias() pulumi.StringOutput {
	return o.ApplyT(func(v *Directory) pulumi.StringOutput { return v.Alias }).(pulumi.StringOutput)
}

// The user name for the service account.
func (o DirectoryOutput) CustomerUserName() pulumi.StringOutput {
	return o.ApplyT(func(v *Directory) pulumi.StringOutput { return v.CustomerUserName }).(pulumi.StringOutput)
}

// The directory identifier for registration in WorkSpaces service.
func (o DirectoryOutput) DirectoryId() pulumi.StringOutput {
	return o.ApplyT(func(v *Directory) pulumi.StringOutput { return v.DirectoryId }).(pulumi.StringOutput)
}

// The name of the directory.
func (o DirectoryOutput) DirectoryName() pulumi.StringOutput {
	return o.ApplyT(func(v *Directory) pulumi.StringOutput { return v.DirectoryName }).(pulumi.StringOutput)
}

// The directory type.
func (o DirectoryOutput) DirectoryType() pulumi.StringOutput {
	return o.ApplyT(func(v *Directory) pulumi.StringOutput { return v.DirectoryType }).(pulumi.StringOutput)
}

// The IP addresses of the DNS servers for the directory.
func (o DirectoryOutput) DnsIpAddresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Directory) pulumi.StringArrayOutput { return v.DnsIpAddresses }).(pulumi.StringArrayOutput)
}

// The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
func (o DirectoryOutput) IamRoleId() pulumi.StringOutput {
	return o.ApplyT(func(v *Directory) pulumi.StringOutput { return v.IamRoleId }).(pulumi.StringOutput)
}

// The identifiers of the IP access control groups associated with the directory.
func (o DirectoryOutput) IpGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Directory) pulumi.StringArrayOutput { return v.IpGroupIds }).(pulumi.StringArrayOutput)
}

// The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
func (o DirectoryOutput) RegistrationCode() pulumi.StringOutput {
	return o.ApplyT(func(v *Directory) pulumi.StringOutput { return v.RegistrationCode }).(pulumi.StringOutput)
}

// Permissions to enable or disable self-service capabilities. Defined below.
func (o DirectoryOutput) SelfServicePermissions() DirectorySelfServicePermissionsOutput {
	return o.ApplyT(func(v *Directory) DirectorySelfServicePermissionsOutput { return v.SelfServicePermissions }).(DirectorySelfServicePermissionsOutput)
}

// The identifiers of the subnets where the directory resides.
func (o DirectoryOutput) SubnetIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Directory) pulumi.StringArrayOutput { return v.SubnetIds }).(pulumi.StringArrayOutput)
}

// A map of tags assigned to the WorkSpaces directory. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o DirectoryOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Directory) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o DirectoryOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Directory) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Specifies which devices and operating systems users can use to access their WorkSpaces. Defined below.
func (o DirectoryOutput) WorkspaceAccessProperties() DirectoryWorkspaceAccessPropertiesOutput {
	return o.ApplyT(func(v *Directory) DirectoryWorkspaceAccessPropertiesOutput { return v.WorkspaceAccessProperties }).(DirectoryWorkspaceAccessPropertiesOutput)
}

// Default properties that are used for creating WorkSpaces. Defined below.
func (o DirectoryOutput) WorkspaceCreationProperties() DirectoryWorkspaceCreationPropertiesOutput {
	return o.ApplyT(func(v *Directory) DirectoryWorkspaceCreationPropertiesOutput { return v.WorkspaceCreationProperties }).(DirectoryWorkspaceCreationPropertiesOutput)
}

// The identifier of the security group that is assigned to new WorkSpaces.
func (o DirectoryOutput) WorkspaceSecurityGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Directory) pulumi.StringOutput { return v.WorkspaceSecurityGroupId }).(pulumi.StringOutput)
}

type DirectoryArrayOutput struct{ *pulumi.OutputState }

func (DirectoryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Directory)(nil)).Elem()
}

func (o DirectoryArrayOutput) ToDirectoryArrayOutput() DirectoryArrayOutput {
	return o
}

func (o DirectoryArrayOutput) ToDirectoryArrayOutputWithContext(ctx context.Context) DirectoryArrayOutput {
	return o
}

func (o DirectoryArrayOutput) Index(i pulumi.IntInput) DirectoryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Directory {
		return vs[0].([]*Directory)[vs[1].(int)]
	}).(DirectoryOutput)
}

type DirectoryMapOutput struct{ *pulumi.OutputState }

func (DirectoryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Directory)(nil)).Elem()
}

func (o DirectoryMapOutput) ToDirectoryMapOutput() DirectoryMapOutput {
	return o
}

func (o DirectoryMapOutput) ToDirectoryMapOutputWithContext(ctx context.Context) DirectoryMapOutput {
	return o
}

func (o DirectoryMapOutput) MapIndex(k pulumi.StringInput) DirectoryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Directory {
		return vs[0].(map[string]*Directory)[vs[1].(string)]
	}).(DirectoryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DirectoryInput)(nil)).Elem(), &Directory{})
	pulumi.RegisterInputType(reflect.TypeOf((*DirectoryArrayInput)(nil)).Elem(), DirectoryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DirectoryMapInput)(nil)).Elem(), DirectoryMap{})
	pulumi.RegisterOutputType(DirectoryOutput{})
	pulumi.RegisterOutputType(DirectoryArrayOutput{})
	pulumi.RegisterOutputType(DirectoryMapOutput{})
}
