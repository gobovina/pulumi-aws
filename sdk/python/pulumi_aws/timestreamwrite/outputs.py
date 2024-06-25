# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities
from . import outputs

__all__ = [
    'TableMagneticStoreWriteProperties',
    'TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation',
    'TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration',
    'TableRetentionProperties',
    'TableSchema',
    'TableSchemaCompositePartitionKey',
]

@pulumi.output_type
class TableMagneticStoreWriteProperties(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "enableMagneticStoreWrites":
            suggest = "enable_magnetic_store_writes"
        elif key == "magneticStoreRejectedDataLocation":
            suggest = "magnetic_store_rejected_data_location"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in TableMagneticStoreWriteProperties. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        TableMagneticStoreWriteProperties.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        TableMagneticStoreWriteProperties.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 enable_magnetic_store_writes: Optional[bool] = None,
                 magnetic_store_rejected_data_location: Optional['outputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation'] = None):
        """
        :param bool enable_magnetic_store_writes: A flag to enable magnetic store writes.
        :param 'TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs' magnetic_store_rejected_data_location: The location to write error reports for records rejected asynchronously during magnetic store writes. See Magnetic Store Rejected Data Location below for more details.
        """
        if enable_magnetic_store_writes is not None:
            pulumi.set(__self__, "enable_magnetic_store_writes", enable_magnetic_store_writes)
        if magnetic_store_rejected_data_location is not None:
            pulumi.set(__self__, "magnetic_store_rejected_data_location", magnetic_store_rejected_data_location)

    @property
    @pulumi.getter(name="enableMagneticStoreWrites")
    def enable_magnetic_store_writes(self) -> Optional[bool]:
        """
        A flag to enable magnetic store writes.
        """
        return pulumi.get(self, "enable_magnetic_store_writes")

    @property
    @pulumi.getter(name="magneticStoreRejectedDataLocation")
    def magnetic_store_rejected_data_location(self) -> Optional['outputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation']:
        """
        The location to write error reports for records rejected asynchronously during magnetic store writes. See Magnetic Store Rejected Data Location below for more details.
        """
        return pulumi.get(self, "magnetic_store_rejected_data_location")


@pulumi.output_type
class TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "s3Configuration":
            suggest = "s3_configuration"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 s3_configuration: Optional['outputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration'] = None):
        """
        :param 'TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs' s3_configuration: Configuration of an S3 location to write error reports for records rejected, asynchronously, during magnetic store writes. See S3 Configuration below for more details.
        """
        if s3_configuration is not None:
            pulumi.set(__self__, "s3_configuration", s3_configuration)

    @property
    @pulumi.getter(name="s3Configuration")
    def s3_configuration(self) -> Optional['outputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration']:
        """
        Configuration of an S3 location to write error reports for records rejected, asynchronously, during magnetic store writes. See S3 Configuration below for more details.
        """
        return pulumi.get(self, "s3_configuration")


@pulumi.output_type
class TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "bucketName":
            suggest = "bucket_name"
        elif key == "encryptionOption":
            suggest = "encryption_option"
        elif key == "kmsKeyId":
            suggest = "kms_key_id"
        elif key == "objectKeyPrefix":
            suggest = "object_key_prefix"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 bucket_name: Optional[str] = None,
                 encryption_option: Optional[str] = None,
                 kms_key_id: Optional[str] = None,
                 object_key_prefix: Optional[str] = None):
        """
        :param str bucket_name: Bucket name of the customer S3 bucket.
        :param str encryption_option: Encryption option for the customer s3 location. Options are S3 server side encryption with an S3-managed key or KMS managed key. Valid values are `SSE_KMS` and `SSE_S3`.
        :param str kms_key_id: KMS key arn for the customer s3 location when encrypting with a KMS managed key.
        :param str object_key_prefix: Object key prefix for the customer S3 location.
        """
        if bucket_name is not None:
            pulumi.set(__self__, "bucket_name", bucket_name)
        if encryption_option is not None:
            pulumi.set(__self__, "encryption_option", encryption_option)
        if kms_key_id is not None:
            pulumi.set(__self__, "kms_key_id", kms_key_id)
        if object_key_prefix is not None:
            pulumi.set(__self__, "object_key_prefix", object_key_prefix)

    @property
    @pulumi.getter(name="bucketName")
    def bucket_name(self) -> Optional[str]:
        """
        Bucket name of the customer S3 bucket.
        """
        return pulumi.get(self, "bucket_name")

    @property
    @pulumi.getter(name="encryptionOption")
    def encryption_option(self) -> Optional[str]:
        """
        Encryption option for the customer s3 location. Options are S3 server side encryption with an S3-managed key or KMS managed key. Valid values are `SSE_KMS` and `SSE_S3`.
        """
        return pulumi.get(self, "encryption_option")

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> Optional[str]:
        """
        KMS key arn for the customer s3 location when encrypting with a KMS managed key.
        """
        return pulumi.get(self, "kms_key_id")

    @property
    @pulumi.getter(name="objectKeyPrefix")
    def object_key_prefix(self) -> Optional[str]:
        """
        Object key prefix for the customer S3 location.
        """
        return pulumi.get(self, "object_key_prefix")


@pulumi.output_type
class TableRetentionProperties(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "magneticStoreRetentionPeriodInDays":
            suggest = "magnetic_store_retention_period_in_days"
        elif key == "memoryStoreRetentionPeriodInHours":
            suggest = "memory_store_retention_period_in_hours"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in TableRetentionProperties. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        TableRetentionProperties.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        TableRetentionProperties.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 magnetic_store_retention_period_in_days: int,
                 memory_store_retention_period_in_hours: int):
        """
        :param int magnetic_store_retention_period_in_days: The duration for which data must be stored in the magnetic store. Minimum value of 1. Maximum value of 73000.
        :param int memory_store_retention_period_in_hours: The duration for which data must be stored in the memory store. Minimum value of 1. Maximum value of 8766.
        """
        pulumi.set(__self__, "magnetic_store_retention_period_in_days", magnetic_store_retention_period_in_days)
        pulumi.set(__self__, "memory_store_retention_period_in_hours", memory_store_retention_period_in_hours)

    @property
    @pulumi.getter(name="magneticStoreRetentionPeriodInDays")
    def magnetic_store_retention_period_in_days(self) -> int:
        """
        The duration for which data must be stored in the magnetic store. Minimum value of 1. Maximum value of 73000.
        """
        return pulumi.get(self, "magnetic_store_retention_period_in_days")

    @property
    @pulumi.getter(name="memoryStoreRetentionPeriodInHours")
    def memory_store_retention_period_in_hours(self) -> int:
        """
        The duration for which data must be stored in the memory store. Minimum value of 1. Maximum value of 8766.
        """
        return pulumi.get(self, "memory_store_retention_period_in_hours")


@pulumi.output_type
class TableSchema(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "compositePartitionKey":
            suggest = "composite_partition_key"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in TableSchema. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        TableSchema.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        TableSchema.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 composite_partition_key: Optional['outputs.TableSchemaCompositePartitionKey'] = None):
        """
        :param 'TableSchemaCompositePartitionKeyArgs' composite_partition_key: A non-empty list of partition keys defining the attributes used to partition the table data. The order of the list determines the partition hierarchy. The name and type of each partition key as well as the partition key order cannot be changed after the table is created. However, the enforcement level of each partition key can be changed. See Composite Partition Key below for more details.
        """
        if composite_partition_key is not None:
            pulumi.set(__self__, "composite_partition_key", composite_partition_key)

    @property
    @pulumi.getter(name="compositePartitionKey")
    def composite_partition_key(self) -> Optional['outputs.TableSchemaCompositePartitionKey']:
        """
        A non-empty list of partition keys defining the attributes used to partition the table data. The order of the list determines the partition hierarchy. The name and type of each partition key as well as the partition key order cannot be changed after the table is created. However, the enforcement level of each partition key can be changed. See Composite Partition Key below for more details.
        """
        return pulumi.get(self, "composite_partition_key")


@pulumi.output_type
class TableSchemaCompositePartitionKey(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "enforcementInRecord":
            suggest = "enforcement_in_record"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in TableSchemaCompositePartitionKey. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        TableSchemaCompositePartitionKey.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        TableSchemaCompositePartitionKey.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 type: str,
                 enforcement_in_record: Optional[str] = None,
                 name: Optional[str] = None):
        """
        :param str type: The type of the partition key. Valid values: `DIMENSION`, `MEASURE`.
        :param str enforcement_in_record: The level of enforcement for the specification of a dimension key in ingested records. Valid values: `REQUIRED`, `OPTIONAL`.
        :param str name: The name of the attribute used for a dimension key.
        """
        pulumi.set(__self__, "type", type)
        if enforcement_in_record is not None:
            pulumi.set(__self__, "enforcement_in_record", enforcement_in_record)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The type of the partition key. Valid values: `DIMENSION`, `MEASURE`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="enforcementInRecord")
    def enforcement_in_record(self) -> Optional[str]:
        """
        The level of enforcement for the specification of a dimension key in ingested records. Valid values: `REQUIRED`, `OPTIONAL`.
        """
        return pulumi.get(self, "enforcement_in_record")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The name of the attribute used for a dimension key.
        """
        return pulumi.get(self, "name")


