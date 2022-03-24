// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package grafana

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Amazon Managed Grafana workspace license association resource.
//
// ## Example Usage
// ### Basic configuration
//
// ```go
// package main
//
// import (
// 	"encoding/json"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/grafana"
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/iam"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		tmpJSON0, err := json.Marshal(map[string]interface{}{
// 			"Version": "2012-10-17",
// 			"Statement": []map[string]interface{}{
// 				map[string]interface{}{
// 					"Action": "sts:AssumeRole",
// 					"Effect": "Allow",
// 					"Sid":    "",
// 					"Principal": map[string]interface{}{
// 						"Service": "grafana.amazonaws.com",
// 					},
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		json0 := string(tmpJSON0)
// 		assume, err := iam.NewRole(ctx, "assume", &iam.RoleArgs{
// 			AssumeRolePolicy: pulumi.String(json0),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleWorkspace, err := grafana.NewWorkspace(ctx, "exampleWorkspace", &grafana.WorkspaceArgs{
// 			AccountAccessType: pulumi.String("CURRENT_ACCOUNT"),
// 			AuthenticationProviders: pulumi.StringArray{
// 				pulumi.String("SAML"),
// 			},
// 			PermissionType: pulumi.String("SERVICE_MANAGED"),
// 			RoleArn:        assume.Arn,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = grafana.NewLicenseAssociation(ctx, "exampleLicenseAssociation", &grafana.LicenseAssociationArgs{
// 			LicenseType: pulumi.String("ENTERPRISE_FREE_TRIAL"),
// 			WorkspaceId: exampleWorkspace.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Grafana workspace license association can be imported using the workspace's `id`, e.g.,
//
// ```sh
//  $ pulumi import aws:grafana/licenseAssociation:LicenseAssociation example g-2054c75a02
// ```
type LicenseAssociation struct {
	pulumi.CustomResourceState

	// If `licenseType` is set to `ENTERPRISE_FREE_TRIAL`, this is the expiration date of the free trial.
	FreeTrialExpiration pulumi.StringOutput `pulumi:"freeTrialExpiration"`
	// If `licenseType` is set to `ENTERPRISE`, this is the expiration date of the enterprise license.
	LicenseExpiration pulumi.StringOutput `pulumi:"licenseExpiration"`
	// The type of license for the workspace license association. Valid values are `ENTERPRISE` and `ENTERPRISE_FREE_TRIAL`.
	LicenseType pulumi.StringOutput `pulumi:"licenseType"`
	// The workspace id.
	WorkspaceId pulumi.StringOutput `pulumi:"workspaceId"`
}

// NewLicenseAssociation registers a new resource with the given unique name, arguments, and options.
func NewLicenseAssociation(ctx *pulumi.Context,
	name string, args *LicenseAssociationArgs, opts ...pulumi.ResourceOption) (*LicenseAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LicenseType == nil {
		return nil, errors.New("invalid value for required argument 'LicenseType'")
	}
	if args.WorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceId'")
	}
	var resource LicenseAssociation
	err := ctx.RegisterResource("aws:grafana/licenseAssociation:LicenseAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLicenseAssociation gets an existing LicenseAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLicenseAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LicenseAssociationState, opts ...pulumi.ResourceOption) (*LicenseAssociation, error) {
	var resource LicenseAssociation
	err := ctx.ReadResource("aws:grafana/licenseAssociation:LicenseAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LicenseAssociation resources.
type licenseAssociationState struct {
	// If `licenseType` is set to `ENTERPRISE_FREE_TRIAL`, this is the expiration date of the free trial.
	FreeTrialExpiration *string `pulumi:"freeTrialExpiration"`
	// If `licenseType` is set to `ENTERPRISE`, this is the expiration date of the enterprise license.
	LicenseExpiration *string `pulumi:"licenseExpiration"`
	// The type of license for the workspace license association. Valid values are `ENTERPRISE` and `ENTERPRISE_FREE_TRIAL`.
	LicenseType *string `pulumi:"licenseType"`
	// The workspace id.
	WorkspaceId *string `pulumi:"workspaceId"`
}

type LicenseAssociationState struct {
	// If `licenseType` is set to `ENTERPRISE_FREE_TRIAL`, this is the expiration date of the free trial.
	FreeTrialExpiration pulumi.StringPtrInput
	// If `licenseType` is set to `ENTERPRISE`, this is the expiration date of the enterprise license.
	LicenseExpiration pulumi.StringPtrInput
	// The type of license for the workspace license association. Valid values are `ENTERPRISE` and `ENTERPRISE_FREE_TRIAL`.
	LicenseType pulumi.StringPtrInput
	// The workspace id.
	WorkspaceId pulumi.StringPtrInput
}

func (LicenseAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*licenseAssociationState)(nil)).Elem()
}

type licenseAssociationArgs struct {
	// The type of license for the workspace license association. Valid values are `ENTERPRISE` and `ENTERPRISE_FREE_TRIAL`.
	LicenseType string `pulumi:"licenseType"`
	// The workspace id.
	WorkspaceId string `pulumi:"workspaceId"`
}

// The set of arguments for constructing a LicenseAssociation resource.
type LicenseAssociationArgs struct {
	// The type of license for the workspace license association. Valid values are `ENTERPRISE` and `ENTERPRISE_FREE_TRIAL`.
	LicenseType pulumi.StringInput
	// The workspace id.
	WorkspaceId pulumi.StringInput
}

func (LicenseAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*licenseAssociationArgs)(nil)).Elem()
}

type LicenseAssociationInput interface {
	pulumi.Input

	ToLicenseAssociationOutput() LicenseAssociationOutput
	ToLicenseAssociationOutputWithContext(ctx context.Context) LicenseAssociationOutput
}

func (*LicenseAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**LicenseAssociation)(nil)).Elem()
}

func (i *LicenseAssociation) ToLicenseAssociationOutput() LicenseAssociationOutput {
	return i.ToLicenseAssociationOutputWithContext(context.Background())
}

func (i *LicenseAssociation) ToLicenseAssociationOutputWithContext(ctx context.Context) LicenseAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LicenseAssociationOutput)
}

// LicenseAssociationArrayInput is an input type that accepts LicenseAssociationArray and LicenseAssociationArrayOutput values.
// You can construct a concrete instance of `LicenseAssociationArrayInput` via:
//
//          LicenseAssociationArray{ LicenseAssociationArgs{...} }
type LicenseAssociationArrayInput interface {
	pulumi.Input

	ToLicenseAssociationArrayOutput() LicenseAssociationArrayOutput
	ToLicenseAssociationArrayOutputWithContext(context.Context) LicenseAssociationArrayOutput
}

type LicenseAssociationArray []LicenseAssociationInput

func (LicenseAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LicenseAssociation)(nil)).Elem()
}

func (i LicenseAssociationArray) ToLicenseAssociationArrayOutput() LicenseAssociationArrayOutput {
	return i.ToLicenseAssociationArrayOutputWithContext(context.Background())
}

func (i LicenseAssociationArray) ToLicenseAssociationArrayOutputWithContext(ctx context.Context) LicenseAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LicenseAssociationArrayOutput)
}

// LicenseAssociationMapInput is an input type that accepts LicenseAssociationMap and LicenseAssociationMapOutput values.
// You can construct a concrete instance of `LicenseAssociationMapInput` via:
//
//          LicenseAssociationMap{ "key": LicenseAssociationArgs{...} }
type LicenseAssociationMapInput interface {
	pulumi.Input

	ToLicenseAssociationMapOutput() LicenseAssociationMapOutput
	ToLicenseAssociationMapOutputWithContext(context.Context) LicenseAssociationMapOutput
}

type LicenseAssociationMap map[string]LicenseAssociationInput

func (LicenseAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LicenseAssociation)(nil)).Elem()
}

func (i LicenseAssociationMap) ToLicenseAssociationMapOutput() LicenseAssociationMapOutput {
	return i.ToLicenseAssociationMapOutputWithContext(context.Background())
}

func (i LicenseAssociationMap) ToLicenseAssociationMapOutputWithContext(ctx context.Context) LicenseAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LicenseAssociationMapOutput)
}

type LicenseAssociationOutput struct{ *pulumi.OutputState }

func (LicenseAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LicenseAssociation)(nil)).Elem()
}

func (o LicenseAssociationOutput) ToLicenseAssociationOutput() LicenseAssociationOutput {
	return o
}

func (o LicenseAssociationOutput) ToLicenseAssociationOutputWithContext(ctx context.Context) LicenseAssociationOutput {
	return o
}

type LicenseAssociationArrayOutput struct{ *pulumi.OutputState }

func (LicenseAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LicenseAssociation)(nil)).Elem()
}

func (o LicenseAssociationArrayOutput) ToLicenseAssociationArrayOutput() LicenseAssociationArrayOutput {
	return o
}

func (o LicenseAssociationArrayOutput) ToLicenseAssociationArrayOutputWithContext(ctx context.Context) LicenseAssociationArrayOutput {
	return o
}

func (o LicenseAssociationArrayOutput) Index(i pulumi.IntInput) LicenseAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LicenseAssociation {
		return vs[0].([]*LicenseAssociation)[vs[1].(int)]
	}).(LicenseAssociationOutput)
}

type LicenseAssociationMapOutput struct{ *pulumi.OutputState }

func (LicenseAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LicenseAssociation)(nil)).Elem()
}

func (o LicenseAssociationMapOutput) ToLicenseAssociationMapOutput() LicenseAssociationMapOutput {
	return o
}

func (o LicenseAssociationMapOutput) ToLicenseAssociationMapOutputWithContext(ctx context.Context) LicenseAssociationMapOutput {
	return o
}

func (o LicenseAssociationMapOutput) MapIndex(k pulumi.StringInput) LicenseAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LicenseAssociation {
		return vs[0].(map[string]*LicenseAssociation)[vs[1].(string)]
	}).(LicenseAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LicenseAssociationInput)(nil)).Elem(), &LicenseAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*LicenseAssociationArrayInput)(nil)).Elem(), LicenseAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LicenseAssociationMapInput)(nil)).Elem(), LicenseAssociationMap{})
	pulumi.RegisterOutputType(LicenseAssociationOutput{})
	pulumi.RegisterOutputType(LicenseAssociationArrayOutput{})
	pulumi.RegisterOutputType(LicenseAssociationMapOutput{})
}
