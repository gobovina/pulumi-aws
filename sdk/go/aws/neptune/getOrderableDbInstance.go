// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package neptune

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Information about Neptune orderable DB instances.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/neptune"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := neptune.GetOrderableDbInstance(ctx, &neptune.GetOrderableDbInstanceArgs{
//				EngineVersion: pulumi.StringRef("1.0.3.0"),
//				PreferredInstanceClasses: []string{
//					"db.r5.large",
//					"db.r4.large",
//					"db.t3.medium",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetOrderableDbInstance(ctx *pulumi.Context, args *GetOrderableDbInstanceArgs, opts ...pulumi.InvokeOption) (*GetOrderableDbInstanceResult, error) {
	var rv GetOrderableDbInstanceResult
	err := ctx.Invoke("aws:neptune/getOrderableDbInstance:getOrderableDbInstance", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOrderableDbInstance.
type GetOrderableDbInstanceArgs struct {
	// DB engine. (Default: `neptune`)
	Engine *string `pulumi:"engine"`
	// Version of the DB engine. For example, `1.0.1.0`, `1.0.1.2`, `1.0.2.2`, and `1.0.3.0`.
	EngineVersion *string `pulumi:"engineVersion"`
	// DB instance class. Examples of classes are `db.r5.large`, `db.r5.xlarge`, `db.r4.large`, `db.r5.4xlarge`, `db.r5.12xlarge`, `db.r4.xlarge`, and `db.t3.medium`.
	InstanceClass *string `pulumi:"instanceClass"`
	// License model. (Default: `amazon-license`)
	LicenseModel *string `pulumi:"licenseModel"`
	// Ordered list of preferred Neptune DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
	PreferredInstanceClasses []string `pulumi:"preferredInstanceClasses"`
	// Enable to show only VPC offerings.
	Vpc *bool `pulumi:"vpc"`
}

// A collection of values returned by getOrderableDbInstance.
type GetOrderableDbInstanceResult struct {
	// Availability zones where the instance is available.
	AvailabilityZones []string `pulumi:"availabilityZones"`
	Engine            *string  `pulumi:"engine"`
	EngineVersion     string   `pulumi:"engineVersion"`
	// The provider-assigned unique ID for this managed resource.
	Id            string  `pulumi:"id"`
	InstanceClass string  `pulumi:"instanceClass"`
	LicenseModel  *string `pulumi:"licenseModel"`
	// Maximum total provisioned IOPS for a DB instance.
	MaxIopsPerDbInstance int `pulumi:"maxIopsPerDbInstance"`
	// Maximum provisioned IOPS per GiB for a DB instance.
	MaxIopsPerGib float64 `pulumi:"maxIopsPerGib"`
	// Maximum storage size for a DB instance.
	MaxStorageSize int `pulumi:"maxStorageSize"`
	// Minimum total provisioned IOPS for a DB instance.
	MinIopsPerDbInstance int `pulumi:"minIopsPerDbInstance"`
	// Minimum provisioned IOPS per GiB for a DB instance.
	MinIopsPerGib float64 `pulumi:"minIopsPerGib"`
	// Minimum storage size for a DB instance.
	MinStorageSize int `pulumi:"minStorageSize"`
	// Whether a DB instance is Multi-AZ capable.
	MultiAzCapable           bool     `pulumi:"multiAzCapable"`
	PreferredInstanceClasses []string `pulumi:"preferredInstanceClasses"`
	// Whether a DB instance can have a read replica.
	ReadReplicaCapable bool `pulumi:"readReplicaCapable"`
	// Storage type for a DB instance.
	StorageType string `pulumi:"storageType"`
	// Whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
	SupportsEnhancedMonitoring bool `pulumi:"supportsEnhancedMonitoring"`
	// Whether a DB instance supports IAM database authentication.
	SupportsIamDatabaseAuthentication bool `pulumi:"supportsIamDatabaseAuthentication"`
	// Whether a DB instance supports provisioned IOPS.
	SupportsIops bool `pulumi:"supportsIops"`
	// Whether a DB instance supports Performance Insights.
	SupportsPerformanceInsights bool `pulumi:"supportsPerformanceInsights"`
	// Whether a DB instance supports encrypted storage.
	SupportsStorageEncryption bool `pulumi:"supportsStorageEncryption"`
	Vpc                       bool `pulumi:"vpc"`
}

func GetOrderableDbInstanceOutput(ctx *pulumi.Context, args GetOrderableDbInstanceOutputArgs, opts ...pulumi.InvokeOption) GetOrderableDbInstanceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetOrderableDbInstanceResult, error) {
			args := v.(GetOrderableDbInstanceArgs)
			r, err := GetOrderableDbInstance(ctx, &args, opts...)
			var s GetOrderableDbInstanceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetOrderableDbInstanceResultOutput)
}

// A collection of arguments for invoking getOrderableDbInstance.
type GetOrderableDbInstanceOutputArgs struct {
	// DB engine. (Default: `neptune`)
	Engine pulumi.StringPtrInput `pulumi:"engine"`
	// Version of the DB engine. For example, `1.0.1.0`, `1.0.1.2`, `1.0.2.2`, and `1.0.3.0`.
	EngineVersion pulumi.StringPtrInput `pulumi:"engineVersion"`
	// DB instance class. Examples of classes are `db.r5.large`, `db.r5.xlarge`, `db.r4.large`, `db.r5.4xlarge`, `db.r5.12xlarge`, `db.r4.xlarge`, and `db.t3.medium`.
	InstanceClass pulumi.StringPtrInput `pulumi:"instanceClass"`
	// License model. (Default: `amazon-license`)
	LicenseModel pulumi.StringPtrInput `pulumi:"licenseModel"`
	// Ordered list of preferred Neptune DB instance classes. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned.
	PreferredInstanceClasses pulumi.StringArrayInput `pulumi:"preferredInstanceClasses"`
	// Enable to show only VPC offerings.
	Vpc pulumi.BoolPtrInput `pulumi:"vpc"`
}

func (GetOrderableDbInstanceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOrderableDbInstanceArgs)(nil)).Elem()
}

// A collection of values returned by getOrderableDbInstance.
type GetOrderableDbInstanceResultOutput struct{ *pulumi.OutputState }

func (GetOrderableDbInstanceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetOrderableDbInstanceResult)(nil)).Elem()
}

func (o GetOrderableDbInstanceResultOutput) ToGetOrderableDbInstanceResultOutput() GetOrderableDbInstanceResultOutput {
	return o
}

func (o GetOrderableDbInstanceResultOutput) ToGetOrderableDbInstanceResultOutputWithContext(ctx context.Context) GetOrderableDbInstanceResultOutput {
	return o
}

// Availability zones where the instance is available.
func (o GetOrderableDbInstanceResultOutput) AvailabilityZones() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) []string { return v.AvailabilityZones }).(pulumi.StringArrayOutput)
}

func (o GetOrderableDbInstanceResultOutput) Engine() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) *string { return v.Engine }).(pulumi.StringPtrOutput)
}

func (o GetOrderableDbInstanceResultOutput) EngineVersion() pulumi.StringOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) string { return v.EngineVersion }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetOrderableDbInstanceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetOrderableDbInstanceResultOutput) InstanceClass() pulumi.StringOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) string { return v.InstanceClass }).(pulumi.StringOutput)
}

func (o GetOrderableDbInstanceResultOutput) LicenseModel() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) *string { return v.LicenseModel }).(pulumi.StringPtrOutput)
}

// Maximum total provisioned IOPS for a DB instance.
func (o GetOrderableDbInstanceResultOutput) MaxIopsPerDbInstance() pulumi.IntOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) int { return v.MaxIopsPerDbInstance }).(pulumi.IntOutput)
}

// Maximum provisioned IOPS per GiB for a DB instance.
func (o GetOrderableDbInstanceResultOutput) MaxIopsPerGib() pulumi.Float64Output {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) float64 { return v.MaxIopsPerGib }).(pulumi.Float64Output)
}

// Maximum storage size for a DB instance.
func (o GetOrderableDbInstanceResultOutput) MaxStorageSize() pulumi.IntOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) int { return v.MaxStorageSize }).(pulumi.IntOutput)
}

// Minimum total provisioned IOPS for a DB instance.
func (o GetOrderableDbInstanceResultOutput) MinIopsPerDbInstance() pulumi.IntOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) int { return v.MinIopsPerDbInstance }).(pulumi.IntOutput)
}

// Minimum provisioned IOPS per GiB for a DB instance.
func (o GetOrderableDbInstanceResultOutput) MinIopsPerGib() pulumi.Float64Output {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) float64 { return v.MinIopsPerGib }).(pulumi.Float64Output)
}

// Minimum storage size for a DB instance.
func (o GetOrderableDbInstanceResultOutput) MinStorageSize() pulumi.IntOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) int { return v.MinStorageSize }).(pulumi.IntOutput)
}

// Whether a DB instance is Multi-AZ capable.
func (o GetOrderableDbInstanceResultOutput) MultiAzCapable() pulumi.BoolOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) bool { return v.MultiAzCapable }).(pulumi.BoolOutput)
}

func (o GetOrderableDbInstanceResultOutput) PreferredInstanceClasses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) []string { return v.PreferredInstanceClasses }).(pulumi.StringArrayOutput)
}

// Whether a DB instance can have a read replica.
func (o GetOrderableDbInstanceResultOutput) ReadReplicaCapable() pulumi.BoolOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) bool { return v.ReadReplicaCapable }).(pulumi.BoolOutput)
}

// Storage type for a DB instance.
func (o GetOrderableDbInstanceResultOutput) StorageType() pulumi.StringOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) string { return v.StorageType }).(pulumi.StringOutput)
}

// Whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
func (o GetOrderableDbInstanceResultOutput) SupportsEnhancedMonitoring() pulumi.BoolOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) bool { return v.SupportsEnhancedMonitoring }).(pulumi.BoolOutput)
}

// Whether a DB instance supports IAM database authentication.
func (o GetOrderableDbInstanceResultOutput) SupportsIamDatabaseAuthentication() pulumi.BoolOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) bool { return v.SupportsIamDatabaseAuthentication }).(pulumi.BoolOutput)
}

// Whether a DB instance supports provisioned IOPS.
func (o GetOrderableDbInstanceResultOutput) SupportsIops() pulumi.BoolOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) bool { return v.SupportsIops }).(pulumi.BoolOutput)
}

// Whether a DB instance supports Performance Insights.
func (o GetOrderableDbInstanceResultOutput) SupportsPerformanceInsights() pulumi.BoolOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) bool { return v.SupportsPerformanceInsights }).(pulumi.BoolOutput)
}

// Whether a DB instance supports encrypted storage.
func (o GetOrderableDbInstanceResultOutput) SupportsStorageEncryption() pulumi.BoolOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) bool { return v.SupportsStorageEncryption }).(pulumi.BoolOutput)
}

func (o GetOrderableDbInstanceResultOutput) Vpc() pulumi.BoolOutput {
	return o.ApplyT(func(v GetOrderableDbInstanceResult) bool { return v.Vpc }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(GetOrderableDbInstanceResultOutput{})
}
