// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about an RDS instance
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/rds"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := rds.LookupInstance(ctx, &rds.LookupInstanceArgs{
//				DbInstanceIdentifier: "my-test-database",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupInstance(ctx *pulumi.Context, args *LookupInstanceArgs, opts ...pulumi.InvokeOption) (*LookupInstanceResult, error) {
	var rv LookupInstanceResult
	err := ctx.Invoke("aws:rds/getInstance:getInstance", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstance.
type LookupInstanceArgs struct {
	// Name of the RDS instance
	DbInstanceIdentifier string            `pulumi:"dbInstanceIdentifier"`
	Tags                 map[string]string `pulumi:"tags"`
}

// A collection of values returned by getInstance.
type LookupInstanceResult struct {
	// Hostname of the RDS instance. See also `endpoint` and `port`.
	Address string `pulumi:"address"`
	// Allocated storage size specified in gigabytes.
	AllocatedStorage int `pulumi:"allocatedStorage"`
	// Indicates that minor version patches are applied automatically.
	AutoMinorVersionUpgrade bool `pulumi:"autoMinorVersionUpgrade"`
	// Name of the Availability Zone the DB instance is located in.
	AvailabilityZone string `pulumi:"availabilityZone"`
	// Specifies the number of days for which automatic DB snapshots are retained.
	BackupRetentionPeriod int `pulumi:"backupRetentionPeriod"`
	// Identifier of the CA certificate for the DB instance.
	CaCertIdentifier string `pulumi:"caCertIdentifier"`
	// If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
	DbClusterIdentifier string `pulumi:"dbClusterIdentifier"`
	// ARN for the DB instance.
	DbInstanceArn string `pulumi:"dbInstanceArn"`
	// Contains the name of the compute and memory capacity class of the DB instance.
	DbInstanceClass      string `pulumi:"dbInstanceClass"`
	DbInstanceIdentifier string `pulumi:"dbInstanceIdentifier"`
	// Port that the DB instance listens on.
	DbInstancePort int `pulumi:"dbInstancePort"`
	// Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance.
	DbName string `pulumi:"dbName"`
	// Provides the list of DB parameter groups applied to this DB instance.
	DbParameterGroups []string `pulumi:"dbParameterGroups"`
	// Provides List of DB security groups associated to this DB instance.
	DbSecurityGroups []string `pulumi:"dbSecurityGroups"`
	// Name of the subnet group associated with the DB instance.
	DbSubnetGroup string `pulumi:"dbSubnetGroup"`
	// List of log types to export to cloudwatch.
	EnabledCloudwatchLogsExports []string `pulumi:"enabledCloudwatchLogsExports"`
	// Connection endpoint in `address:port` format.
	Endpoint string `pulumi:"endpoint"`
	// Provides the name of the database engine to be used for this DB instance.
	Engine string `pulumi:"engine"`
	// Database engine version.
	EngineVersion string `pulumi:"engineVersion"`
	// Canonical hosted zone ID of the DB instance (to be used in a Route 53 Alias record).
	HostedZoneId string `pulumi:"hostedZoneId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Provisioned IOPS (I/O operations per second) value.
	Iops int `pulumi:"iops"`
	// The Amazon Web Services KMS key identifier that is used to encrypt the secret.
	KmsKeyId string `pulumi:"kmsKeyId"`
	// License model information for this DB instance.
	LicenseModel string `pulumi:"licenseModel"`
	// Provides the master user secret. Only available when `manageMasterUserPassword` is set to true. Documented below.
	MasterUserSecrets []GetInstanceMasterUserSecret `pulumi:"masterUserSecrets"`
	// Contains the master username for the DB instance.
	MasterUsername string `pulumi:"masterUsername"`
	// Interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
	MonitoringInterval int `pulumi:"monitoringInterval"`
	// ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to CloudWatch Logs.
	MonitoringRoleArn string `pulumi:"monitoringRoleArn"`
	// If the DB instance is a Multi-AZ deployment.
	MultiAz bool `pulumi:"multiAz"`
	// Network type of the DB instance.
	NetworkType string `pulumi:"networkType"`
	// Provides the list of option group memberships for this DB instance.
	OptionGroupMemberships []string `pulumi:"optionGroupMemberships"`
	// Database port.
	Port int `pulumi:"port"`
	// Specifies the daily time range during which automated backups are created.
	PreferredBackupWindow string `pulumi:"preferredBackupWindow"`
	// Specifies the weekly time range during which system maintenance can occur in UTC.
	PreferredMaintenanceWindow string `pulumi:"preferredMaintenanceWindow"`
	// Accessibility options for the DB instance.
	PubliclyAccessible bool `pulumi:"publiclyAccessible"`
	// Identifier of the source DB that this is a replica of.
	ReplicateSourceDb string `pulumi:"replicateSourceDb"`
	// RDS Resource ID of this instance.
	ResourceId string `pulumi:"resourceId"`
	// Whether the DB instance is encrypted.
	StorageEncrypted bool `pulumi:"storageEncrypted"`
	// Storage throughput value for the DB instance.
	StorageThroughput int `pulumi:"storageThroughput"`
	// Storage type associated with DB instance.
	StorageType string            `pulumi:"storageType"`
	Tags        map[string]string `pulumi:"tags"`
	// Time zone of the DB instance.
	Timezone string `pulumi:"timezone"`
	// Provides a list of VPC security group elements that the DB instance belongs to.
	VpcSecurityGroups []string `pulumi:"vpcSecurityGroups"`
}

func LookupInstanceOutput(ctx *pulumi.Context, args LookupInstanceOutputArgs, opts ...pulumi.InvokeOption) LookupInstanceResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupInstanceResult, error) {
			args := v.(LookupInstanceArgs)
			r, err := LookupInstance(ctx, &args, opts...)
			var s LookupInstanceResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupInstanceResultOutput)
}

// A collection of arguments for invoking getInstance.
type LookupInstanceOutputArgs struct {
	// Name of the RDS instance
	DbInstanceIdentifier pulumi.StringInput    `pulumi:"dbInstanceIdentifier"`
	Tags                 pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupInstanceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInstanceArgs)(nil)).Elem()
}

// A collection of values returned by getInstance.
type LookupInstanceResultOutput struct{ *pulumi.OutputState }

func (LookupInstanceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInstanceResult)(nil)).Elem()
}

func (o LookupInstanceResultOutput) ToLookupInstanceResultOutput() LookupInstanceResultOutput {
	return o
}

func (o LookupInstanceResultOutput) ToLookupInstanceResultOutputWithContext(ctx context.Context) LookupInstanceResultOutput {
	return o
}

// Hostname of the RDS instance. See also `endpoint` and `port`.
func (o LookupInstanceResultOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.Address }).(pulumi.StringOutput)
}

// Allocated storage size specified in gigabytes.
func (o LookupInstanceResultOutput) AllocatedStorage() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInstanceResult) int { return v.AllocatedStorage }).(pulumi.IntOutput)
}

// Indicates that minor version patches are applied automatically.
func (o LookupInstanceResultOutput) AutoMinorVersionUpgrade() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInstanceResult) bool { return v.AutoMinorVersionUpgrade }).(pulumi.BoolOutput)
}

// Name of the Availability Zone the DB instance is located in.
func (o LookupInstanceResultOutput) AvailabilityZone() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.AvailabilityZone }).(pulumi.StringOutput)
}

// Specifies the number of days for which automatic DB snapshots are retained.
func (o LookupInstanceResultOutput) BackupRetentionPeriod() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInstanceResult) int { return v.BackupRetentionPeriod }).(pulumi.IntOutput)
}

// Identifier of the CA certificate for the DB instance.
func (o LookupInstanceResultOutput) CaCertIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.CaCertIdentifier }).(pulumi.StringOutput)
}

// If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a member of.
func (o LookupInstanceResultOutput) DbClusterIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.DbClusterIdentifier }).(pulumi.StringOutput)
}

// ARN for the DB instance.
func (o LookupInstanceResultOutput) DbInstanceArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.DbInstanceArn }).(pulumi.StringOutput)
}

// Contains the name of the compute and memory capacity class of the DB instance.
func (o LookupInstanceResultOutput) DbInstanceClass() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.DbInstanceClass }).(pulumi.StringOutput)
}

func (o LookupInstanceResultOutput) DbInstanceIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.DbInstanceIdentifier }).(pulumi.StringOutput)
}

// Port that the DB instance listens on.
func (o LookupInstanceResultOutput) DbInstancePort() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInstanceResult) int { return v.DbInstancePort }).(pulumi.IntOutput)
}

// Contains the name of the initial database of this instance that was provided at create time, if one was specified when the DB instance was created. This same name is returned for the life of the DB instance.
func (o LookupInstanceResultOutput) DbName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.DbName }).(pulumi.StringOutput)
}

// Provides the list of DB parameter groups applied to this DB instance.
func (o LookupInstanceResultOutput) DbParameterGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupInstanceResult) []string { return v.DbParameterGroups }).(pulumi.StringArrayOutput)
}

// Provides List of DB security groups associated to this DB instance.
func (o LookupInstanceResultOutput) DbSecurityGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupInstanceResult) []string { return v.DbSecurityGroups }).(pulumi.StringArrayOutput)
}

// Name of the subnet group associated with the DB instance.
func (o LookupInstanceResultOutput) DbSubnetGroup() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.DbSubnetGroup }).(pulumi.StringOutput)
}

// List of log types to export to cloudwatch.
func (o LookupInstanceResultOutput) EnabledCloudwatchLogsExports() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupInstanceResult) []string { return v.EnabledCloudwatchLogsExports }).(pulumi.StringArrayOutput)
}

// Connection endpoint in `address:port` format.
func (o LookupInstanceResultOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.Endpoint }).(pulumi.StringOutput)
}

// Provides the name of the database engine to be used for this DB instance.
func (o LookupInstanceResultOutput) Engine() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.Engine }).(pulumi.StringOutput)
}

// Database engine version.
func (o LookupInstanceResultOutput) EngineVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.EngineVersion }).(pulumi.StringOutput)
}

// Canonical hosted zone ID of the DB instance (to be used in a Route 53 Alias record).
func (o LookupInstanceResultOutput) HostedZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.HostedZoneId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupInstanceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.Id }).(pulumi.StringOutput)
}

// Provisioned IOPS (I/O operations per second) value.
func (o LookupInstanceResultOutput) Iops() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInstanceResult) int { return v.Iops }).(pulumi.IntOutput)
}

// The Amazon Web Services KMS key identifier that is used to encrypt the secret.
func (o LookupInstanceResultOutput) KmsKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.KmsKeyId }).(pulumi.StringOutput)
}

// License model information for this DB instance.
func (o LookupInstanceResultOutput) LicenseModel() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.LicenseModel }).(pulumi.StringOutput)
}

// Provides the master user secret. Only available when `manageMasterUserPassword` is set to true. Documented below.
func (o LookupInstanceResultOutput) MasterUserSecrets() GetInstanceMasterUserSecretArrayOutput {
	return o.ApplyT(func(v LookupInstanceResult) []GetInstanceMasterUserSecret { return v.MasterUserSecrets }).(GetInstanceMasterUserSecretArrayOutput)
}

// Contains the master username for the DB instance.
func (o LookupInstanceResultOutput) MasterUsername() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.MasterUsername }).(pulumi.StringOutput)
}

// Interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance.
func (o LookupInstanceResultOutput) MonitoringInterval() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInstanceResult) int { return v.MonitoringInterval }).(pulumi.IntOutput)
}

// ARN for the IAM role that permits RDS to send Enhanced Monitoring metrics to CloudWatch Logs.
func (o LookupInstanceResultOutput) MonitoringRoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.MonitoringRoleArn }).(pulumi.StringOutput)
}

// If the DB instance is a Multi-AZ deployment.
func (o LookupInstanceResultOutput) MultiAz() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInstanceResult) bool { return v.MultiAz }).(pulumi.BoolOutput)
}

// Network type of the DB instance.
func (o LookupInstanceResultOutput) NetworkType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.NetworkType }).(pulumi.StringOutput)
}

// Provides the list of option group memberships for this DB instance.
func (o LookupInstanceResultOutput) OptionGroupMemberships() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupInstanceResult) []string { return v.OptionGroupMemberships }).(pulumi.StringArrayOutput)
}

// Database port.
func (o LookupInstanceResultOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInstanceResult) int { return v.Port }).(pulumi.IntOutput)
}

// Specifies the daily time range during which automated backups are created.
func (o LookupInstanceResultOutput) PreferredBackupWindow() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.PreferredBackupWindow }).(pulumi.StringOutput)
}

// Specifies the weekly time range during which system maintenance can occur in UTC.
func (o LookupInstanceResultOutput) PreferredMaintenanceWindow() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.PreferredMaintenanceWindow }).(pulumi.StringOutput)
}

// Accessibility options for the DB instance.
func (o LookupInstanceResultOutput) PubliclyAccessible() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInstanceResult) bool { return v.PubliclyAccessible }).(pulumi.BoolOutput)
}

// Identifier of the source DB that this is a replica of.
func (o LookupInstanceResultOutput) ReplicateSourceDb() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.ReplicateSourceDb }).(pulumi.StringOutput)
}

// RDS Resource ID of this instance.
func (o LookupInstanceResultOutput) ResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.ResourceId }).(pulumi.StringOutput)
}

// Whether the DB instance is encrypted.
func (o LookupInstanceResultOutput) StorageEncrypted() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInstanceResult) bool { return v.StorageEncrypted }).(pulumi.BoolOutput)
}

// Storage throughput value for the DB instance.
func (o LookupInstanceResultOutput) StorageThroughput() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInstanceResult) int { return v.StorageThroughput }).(pulumi.IntOutput)
}

// Storage type associated with DB instance.
func (o LookupInstanceResultOutput) StorageType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.StorageType }).(pulumi.StringOutput)
}

func (o LookupInstanceResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupInstanceResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// Time zone of the DB instance.
func (o LookupInstanceResultOutput) Timezone() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceResult) string { return v.Timezone }).(pulumi.StringOutput)
}

// Provides a list of VPC security group elements that the DB instance belongs to.
func (o LookupInstanceResultOutput) VpcSecurityGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupInstanceResult) []string { return v.VpcSecurityGroups }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupInstanceResultOutput{})
}
