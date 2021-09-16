// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package efs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about an Elastic File System (EFS) File System.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/efs"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		fileSystemId := ""
// 		if param := cfg.Get("fileSystemId"); param != "" {
// 			fileSystemId = param
// 		}
// 		opt0 := fileSystemId
// 		_, err := efs.LookupFileSystem(ctx, &efs.LookupFileSystemArgs{
// 			FileSystemId: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = efs.LookupFileSystem(ctx, &efs.LookupFileSystemArgs{
// 			Tags: map[string]interface{}{
// 				"Environment": "dev",
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupFileSystem(ctx *pulumi.Context, args *LookupFileSystemArgs, opts ...pulumi.InvokeOption) (*LookupFileSystemResult, error) {
	var rv LookupFileSystemResult
	err := ctx.Invoke("aws:efs/getFileSystem:getFileSystem", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFileSystem.
type LookupFileSystemArgs struct {
	// Restricts the list to the file system with this creation token.
	CreationToken *string `pulumi:"creationToken"`
	// The ID that identifies the file system (e.g. fs-ccfc0d65).
	FileSystemId *string `pulumi:"fileSystemId"`
	// Restricts the list to the file system with these tags.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getFileSystem.
type LookupFileSystemResult struct {
	// Amazon Resource Name of the file system.
	Arn string `pulumi:"arn"`
	// The identifier of the Availability Zone in which the file system's One Zone storage classes exist.
	AvailabilityZoneId string `pulumi:"availabilityZoneId"`
	// The Availability Zone name in which the file system's One Zone storage classes exist.
	AvailabilityZoneName string `pulumi:"availabilityZoneName"`
	CreationToken        string `pulumi:"creationToken"`
	// The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
	DnsName string `pulumi:"dnsName"`
	// Whether EFS is encrypted.
	Encrypted    bool   `pulumi:"encrypted"`
	FileSystemId string `pulumi:"fileSystemId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The ARN for the KMS encryption key.
	KmsKeyId string `pulumi:"kmsKeyId"`
	// A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object.
	LifecyclePolicy GetFileSystemLifecyclePolicy `pulumi:"lifecyclePolicy"`
	// The file system performance mode.
	PerformanceMode string `pulumi:"performanceMode"`
	// The throughput, measured in MiB/s, that you want to provision for the file system.
	// * `tags` -A map of tags to assign to the file system.
	ProvisionedThroughputInMibps float64 `pulumi:"provisionedThroughputInMibps"`
	// The current byte count used by the file system.
	SizeInBytes int               `pulumi:"sizeInBytes"`
	Tags        map[string]string `pulumi:"tags"`
	// Throughput mode for the file system.
	ThroughputMode string `pulumi:"throughputMode"`
}

func LookupFileSystemOutput(ctx *pulumi.Context, args LookupFileSystemOutputArgs, opts ...pulumi.InvokeOption) LookupFileSystemResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFileSystemResult, error) {
			args := v.(LookupFileSystemArgs)
			r, err := LookupFileSystem(ctx, &args, opts...)
			return *r, err
		}).(LookupFileSystemResultOutput)
}

// A collection of arguments for invoking getFileSystem.
type LookupFileSystemOutputArgs struct {
	// Restricts the list to the file system with this creation token.
	CreationToken pulumi.StringPtrInput `pulumi:"creationToken"`
	// The ID that identifies the file system (e.g. fs-ccfc0d65).
	FileSystemId pulumi.StringPtrInput `pulumi:"fileSystemId"`
	// Restricts the list to the file system with these tags.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupFileSystemOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFileSystemArgs)(nil)).Elem()
}

// A collection of values returned by getFileSystem.
type LookupFileSystemResultOutput struct{ *pulumi.OutputState }

func (LookupFileSystemResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFileSystemResult)(nil)).Elem()
}

func (o LookupFileSystemResultOutput) ToLookupFileSystemResultOutput() LookupFileSystemResultOutput {
	return o
}

func (o LookupFileSystemResultOutput) ToLookupFileSystemResultOutputWithContext(ctx context.Context) LookupFileSystemResultOutput {
	return o
}

// Amazon Resource Name of the file system.
func (o LookupFileSystemResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileSystemResult) string { return v.Arn }).(pulumi.StringOutput)
}

// The identifier of the Availability Zone in which the file system's One Zone storage classes exist.
func (o LookupFileSystemResultOutput) AvailabilityZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileSystemResult) string { return v.AvailabilityZoneId }).(pulumi.StringOutput)
}

// The Availability Zone name in which the file system's One Zone storage classes exist.
func (o LookupFileSystemResultOutput) AvailabilityZoneName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileSystemResult) string { return v.AvailabilityZoneName }).(pulumi.StringOutput)
}

func (o LookupFileSystemResultOutput) CreationToken() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileSystemResult) string { return v.CreationToken }).(pulumi.StringOutput)
}

// The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
func (o LookupFileSystemResultOutput) DnsName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileSystemResult) string { return v.DnsName }).(pulumi.StringOutput)
}

// Whether EFS is encrypted.
func (o LookupFileSystemResultOutput) Encrypted() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupFileSystemResult) bool { return v.Encrypted }).(pulumi.BoolOutput)
}

func (o LookupFileSystemResultOutput) FileSystemId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileSystemResult) string { return v.FileSystemId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupFileSystemResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileSystemResult) string { return v.Id }).(pulumi.StringOutput)
}

// The ARN for the KMS encryption key.
func (o LookupFileSystemResultOutput) KmsKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileSystemResult) string { return v.KmsKeyId }).(pulumi.StringOutput)
}

// A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object.
func (o LookupFileSystemResultOutput) LifecyclePolicy() GetFileSystemLifecyclePolicyOutput {
	return o.ApplyT(func(v LookupFileSystemResult) GetFileSystemLifecyclePolicy { return v.LifecyclePolicy }).(GetFileSystemLifecyclePolicyOutput)
}

// The file system performance mode.
func (o LookupFileSystemResultOutput) PerformanceMode() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileSystemResult) string { return v.PerformanceMode }).(pulumi.StringOutput)
}

// The throughput, measured in MiB/s, that you want to provision for the file system.
// * `tags` -A map of tags to assign to the file system.
func (o LookupFileSystemResultOutput) ProvisionedThroughputInMibps() pulumi.Float64Output {
	return o.ApplyT(func(v LookupFileSystemResult) float64 { return v.ProvisionedThroughputInMibps }).(pulumi.Float64Output)
}

// The current byte count used by the file system.
func (o LookupFileSystemResultOutput) SizeInBytes() pulumi.IntOutput {
	return o.ApplyT(func(v LookupFileSystemResult) int { return v.SizeInBytes }).(pulumi.IntOutput)
}

func (o LookupFileSystemResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupFileSystemResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// Throughput mode for the file system.
func (o LookupFileSystemResultOutput) ThroughputMode() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileSystemResult) string { return v.ThroughputMode }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFileSystemResultOutput{})
}
