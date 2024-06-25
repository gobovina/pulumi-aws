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
    'GetCatalogTableResult',
    'AwaitableGetCatalogTableResult',
    'get_catalog_table',
    'get_catalog_table_output',
]

@pulumi.output_type
class GetCatalogTableResult:
    """
    A collection of values returned by getCatalogTable.
    """
    def __init__(__self__, arn=None, catalog_id=None, database_name=None, description=None, id=None, name=None, owner=None, parameters=None, partition_indices=None, partition_keys=None, query_as_of_time=None, retention=None, storage_descriptors=None, table_type=None, target_tables=None, transaction_id=None, view_expanded_text=None, view_original_text=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if catalog_id and not isinstance(catalog_id, str):
            raise TypeError("Expected argument 'catalog_id' to be a str")
        pulumi.set(__self__, "catalog_id", catalog_id)
        if database_name and not isinstance(database_name, str):
            raise TypeError("Expected argument 'database_name' to be a str")
        pulumi.set(__self__, "database_name", database_name)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if owner and not isinstance(owner, str):
            raise TypeError("Expected argument 'owner' to be a str")
        pulumi.set(__self__, "owner", owner)
        if parameters and not isinstance(parameters, dict):
            raise TypeError("Expected argument 'parameters' to be a dict")
        pulumi.set(__self__, "parameters", parameters)
        if partition_indices and not isinstance(partition_indices, list):
            raise TypeError("Expected argument 'partition_indices' to be a list")
        pulumi.set(__self__, "partition_indices", partition_indices)
        if partition_keys and not isinstance(partition_keys, list):
            raise TypeError("Expected argument 'partition_keys' to be a list")
        pulumi.set(__self__, "partition_keys", partition_keys)
        if query_as_of_time and not isinstance(query_as_of_time, str):
            raise TypeError("Expected argument 'query_as_of_time' to be a str")
        pulumi.set(__self__, "query_as_of_time", query_as_of_time)
        if retention and not isinstance(retention, int):
            raise TypeError("Expected argument 'retention' to be a int")
        pulumi.set(__self__, "retention", retention)
        if storage_descriptors and not isinstance(storage_descriptors, list):
            raise TypeError("Expected argument 'storage_descriptors' to be a list")
        pulumi.set(__self__, "storage_descriptors", storage_descriptors)
        if table_type and not isinstance(table_type, str):
            raise TypeError("Expected argument 'table_type' to be a str")
        pulumi.set(__self__, "table_type", table_type)
        if target_tables and not isinstance(target_tables, list):
            raise TypeError("Expected argument 'target_tables' to be a list")
        pulumi.set(__self__, "target_tables", target_tables)
        if transaction_id and not isinstance(transaction_id, int):
            raise TypeError("Expected argument 'transaction_id' to be a int")
        pulumi.set(__self__, "transaction_id", transaction_id)
        if view_expanded_text and not isinstance(view_expanded_text, str):
            raise TypeError("Expected argument 'view_expanded_text' to be a str")
        pulumi.set(__self__, "view_expanded_text", view_expanded_text)
        if view_original_text and not isinstance(view_original_text, str):
            raise TypeError("Expected argument 'view_original_text' to be a str")
        pulumi.set(__self__, "view_original_text", view_original_text)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        The ARN of the Glue Table.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="catalogId")
    def catalog_id(self) -> str:
        """
        ID of the Data Catalog in which the table resides.
        """
        return pulumi.get(self, "catalog_id")

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> str:
        """
        Name of the catalog database that contains the target table.
        """
        return pulumi.get(self, "database_name")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the table.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the target table.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def owner(self) -> str:
        """
        Owner of the table.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter
    def parameters(self) -> Mapping[str, str]:
        """
        Map of initialization parameters for the SerDe, in key-value form.
        """
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter(name="partitionIndices")
    def partition_indices(self) -> Sequence['outputs.GetCatalogTablePartitionIndexResult']:
        """
        Configuration block for a maximum of 3 partition indexes. See `partition_index` below.
        """
        return pulumi.get(self, "partition_indices")

    @property
    @pulumi.getter(name="partitionKeys")
    def partition_keys(self) -> Sequence['outputs.GetCatalogTablePartitionKeyResult']:
        """
        Configuration block of columns by which the table is partitioned. Only primitive types are supported as partition keys. See `partition_keys` below.
        """
        return pulumi.get(self, "partition_keys")

    @property
    @pulumi.getter(name="queryAsOfTime")
    def query_as_of_time(self) -> Optional[str]:
        return pulumi.get(self, "query_as_of_time")

    @property
    @pulumi.getter
    def retention(self) -> int:
        """
        Retention time for this table.
        """
        return pulumi.get(self, "retention")

    @property
    @pulumi.getter(name="storageDescriptors")
    def storage_descriptors(self) -> Sequence['outputs.GetCatalogTableStorageDescriptorResult']:
        """
        Configuration block for information about the physical storage of this table. For more information, refer to the [Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-StorageDescriptor). See `storage_descriptor` below.
        """
        return pulumi.get(self, "storage_descriptors")

    @property
    @pulumi.getter(name="tableType")
    def table_type(self) -> str:
        """
        Type of this table (EXTERNAL_TABLE, VIRTUAL_VIEW, etc.). While optional, some Athena DDL queries such as `ALTER TABLE` and `SHOW CREATE TABLE` will fail if this argument is empty.
        """
        return pulumi.get(self, "table_type")

    @property
    @pulumi.getter(name="targetTables")
    def target_tables(self) -> Sequence['outputs.GetCatalogTableTargetTableResult']:
        """
        Configuration block of a target table for resource linking. See `target_table` below.
        """
        return pulumi.get(self, "target_tables")

    @property
    @pulumi.getter(name="transactionId")
    def transaction_id(self) -> Optional[int]:
        return pulumi.get(self, "transaction_id")

    @property
    @pulumi.getter(name="viewExpandedText")
    def view_expanded_text(self) -> str:
        """
        If the table is a view, the expanded text of the view; otherwise null.
        """
        return pulumi.get(self, "view_expanded_text")

    @property
    @pulumi.getter(name="viewOriginalText")
    def view_original_text(self) -> str:
        """
        If the table is a view, the original text of the view; otherwise null.
        """
        return pulumi.get(self, "view_original_text")


class AwaitableGetCatalogTableResult(GetCatalogTableResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCatalogTableResult(
            arn=self.arn,
            catalog_id=self.catalog_id,
            database_name=self.database_name,
            description=self.description,
            id=self.id,
            name=self.name,
            owner=self.owner,
            parameters=self.parameters,
            partition_indices=self.partition_indices,
            partition_keys=self.partition_keys,
            query_as_of_time=self.query_as_of_time,
            retention=self.retention,
            storage_descriptors=self.storage_descriptors,
            table_type=self.table_type,
            target_tables=self.target_tables,
            transaction_id=self.transaction_id,
            view_expanded_text=self.view_expanded_text,
            view_original_text=self.view_original_text)


def get_catalog_table(catalog_id: Optional[str] = None,
                      database_name: Optional[str] = None,
                      name: Optional[str] = None,
                      query_as_of_time: Optional[str] = None,
                      transaction_id: Optional[int] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCatalogTableResult:
    """
    This data source can be used to fetch information about an AWS Glue Data Catalog Table.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.glue.get_catalog_table(name="MyCatalogTable",
        database_name="MyCatalogDatabase")
    ```


    :param str catalog_id: ID of the Glue Catalog and database where the table metadata resides. If omitted, this defaults to the current AWS Account ID.
    :param str database_name: Name of the metadata database where the table metadata resides.
    :param str name: Name of the table.
    :param str query_as_of_time: The time as of when to read the table contents. If not set, the most recent transaction commit time will be used. Cannot be specified along with `transaction_id`. Specified in RFC 3339 format, e.g. `2006-01-02T15:04:05Z07:00`.
    :param int transaction_id: The transaction ID at which to read the table contents.
    """
    __args__ = dict()
    __args__['catalogId'] = catalog_id
    __args__['databaseName'] = database_name
    __args__['name'] = name
    __args__['queryAsOfTime'] = query_as_of_time
    __args__['transactionId'] = transaction_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:glue/getCatalogTable:getCatalogTable', __args__, opts=opts, typ=GetCatalogTableResult).value

    return AwaitableGetCatalogTableResult(
        arn=pulumi.get(__ret__, 'arn'),
        catalog_id=pulumi.get(__ret__, 'catalog_id'),
        database_name=pulumi.get(__ret__, 'database_name'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        owner=pulumi.get(__ret__, 'owner'),
        parameters=pulumi.get(__ret__, 'parameters'),
        partition_indices=pulumi.get(__ret__, 'partition_indices'),
        partition_keys=pulumi.get(__ret__, 'partition_keys'),
        query_as_of_time=pulumi.get(__ret__, 'query_as_of_time'),
        retention=pulumi.get(__ret__, 'retention'),
        storage_descriptors=pulumi.get(__ret__, 'storage_descriptors'),
        table_type=pulumi.get(__ret__, 'table_type'),
        target_tables=pulumi.get(__ret__, 'target_tables'),
        transaction_id=pulumi.get(__ret__, 'transaction_id'),
        view_expanded_text=pulumi.get(__ret__, 'view_expanded_text'),
        view_original_text=pulumi.get(__ret__, 'view_original_text'))


@_utilities.lift_output_func(get_catalog_table)
def get_catalog_table_output(catalog_id: Optional[pulumi.Input[Optional[str]]] = None,
                             database_name: Optional[pulumi.Input[str]] = None,
                             name: Optional[pulumi.Input[str]] = None,
                             query_as_of_time: Optional[pulumi.Input[Optional[str]]] = None,
                             transaction_id: Optional[pulumi.Input[Optional[int]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetCatalogTableResult]:
    """
    This data source can be used to fetch information about an AWS Glue Data Catalog Table.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.glue.get_catalog_table(name="MyCatalogTable",
        database_name="MyCatalogDatabase")
    ```


    :param str catalog_id: ID of the Glue Catalog and database where the table metadata resides. If omitted, this defaults to the current AWS Account ID.
    :param str database_name: Name of the metadata database where the table metadata resides.
    :param str name: Name of the table.
    :param str query_as_of_time: The time as of when to read the table contents. If not set, the most recent transaction commit time will be used. Cannot be specified along with `transaction_id`. Specified in RFC 3339 format, e.g. `2006-01-02T15:04:05Z07:00`.
    :param int transaction_id: The transaction ID at which to read the table contents.
    """
    ...
