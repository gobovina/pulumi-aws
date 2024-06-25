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
from ._inputs import *

__all__ = ['DataCellsFilterArgs', 'DataCellsFilter']

@pulumi.input_type
class DataCellsFilterArgs:
    def __init__(__self__, *,
                 table_data: Optional[pulumi.Input['DataCellsFilterTableDataArgs']] = None,
                 timeouts: Optional[pulumi.Input['DataCellsFilterTimeoutsArgs']] = None):
        """
        The set of arguments for constructing a DataCellsFilter resource.
        :param pulumi.Input['DataCellsFilterTableDataArgs'] table_data: Information about the data cells filter. See Table Data below for details.
        """
        if table_data is not None:
            pulumi.set(__self__, "table_data", table_data)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter(name="tableData")
    def table_data(self) -> Optional[pulumi.Input['DataCellsFilterTableDataArgs']]:
        """
        Information about the data cells filter. See Table Data below for details.
        """
        return pulumi.get(self, "table_data")

    @table_data.setter
    def table_data(self, value: Optional[pulumi.Input['DataCellsFilterTableDataArgs']]):
        pulumi.set(self, "table_data", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['DataCellsFilterTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['DataCellsFilterTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


@pulumi.input_type
class _DataCellsFilterState:
    def __init__(__self__, *,
                 table_data: Optional[pulumi.Input['DataCellsFilterTableDataArgs']] = None,
                 timeouts: Optional[pulumi.Input['DataCellsFilterTimeoutsArgs']] = None):
        """
        Input properties used for looking up and filtering DataCellsFilter resources.
        :param pulumi.Input['DataCellsFilterTableDataArgs'] table_data: Information about the data cells filter. See Table Data below for details.
        """
        if table_data is not None:
            pulumi.set(__self__, "table_data", table_data)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)

    @property
    @pulumi.getter(name="tableData")
    def table_data(self) -> Optional[pulumi.Input['DataCellsFilterTableDataArgs']]:
        """
        Information about the data cells filter. See Table Data below for details.
        """
        return pulumi.get(self, "table_data")

    @table_data.setter
    def table_data(self, value: Optional[pulumi.Input['DataCellsFilterTableDataArgs']]):
        pulumi.set(self, "table_data", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['DataCellsFilterTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['DataCellsFilterTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)


class DataCellsFilter(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 table_data: Optional[pulumi.Input[Union['DataCellsFilterTableDataArgs', 'DataCellsFilterTableDataArgsDict']]] = None,
                 timeouts: Optional[pulumi.Input[Union['DataCellsFilterTimeoutsArgs', 'DataCellsFilterTimeoutsArgsDict']]] = None,
                 __props__=None):
        """
        Resource for managing an AWS Lake Formation Data Cells Filter.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lakeformation.DataCellsFilter("example", table_data={
            "databaseName": test["name"],
            "name": "example",
            "tableCatalogId": current["accountId"],
            "tableName": test_aws_glue_catalog_table["name"],
            "columnNames": ["my_column"],
            "rowFilter": {
                "filterExpression": "my_column='example'",
            },
        })
        ```

        ## Import

        Using `pulumi import`, import Lake Formation Data Cells Filter using the `id`. For example:

        ```sh
        $ pulumi import aws:lakeformation/dataCellsFilter:DataCellsFilter example database_name,name,table_catalog_id,table_name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['DataCellsFilterTableDataArgs', 'DataCellsFilterTableDataArgsDict']] table_data: Information about the data cells filter. See Table Data below for details.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[DataCellsFilterArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS Lake Formation Data Cells Filter.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.lakeformation.DataCellsFilter("example", table_data={
            "databaseName": test["name"],
            "name": "example",
            "tableCatalogId": current["accountId"],
            "tableName": test_aws_glue_catalog_table["name"],
            "columnNames": ["my_column"],
            "rowFilter": {
                "filterExpression": "my_column='example'",
            },
        })
        ```

        ## Import

        Using `pulumi import`, import Lake Formation Data Cells Filter using the `id`. For example:

        ```sh
        $ pulumi import aws:lakeformation/dataCellsFilter:DataCellsFilter example database_name,name,table_catalog_id,table_name
        ```

        :param str resource_name: The name of the resource.
        :param DataCellsFilterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DataCellsFilterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 table_data: Optional[pulumi.Input[Union['DataCellsFilterTableDataArgs', 'DataCellsFilterTableDataArgsDict']]] = None,
                 timeouts: Optional[pulumi.Input[Union['DataCellsFilterTimeoutsArgs', 'DataCellsFilterTimeoutsArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DataCellsFilterArgs.__new__(DataCellsFilterArgs)

            __props__.__dict__["table_data"] = table_data
            __props__.__dict__["timeouts"] = timeouts
        super(DataCellsFilter, __self__).__init__(
            'aws:lakeformation/dataCellsFilter:DataCellsFilter',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            table_data: Optional[pulumi.Input[Union['DataCellsFilterTableDataArgs', 'DataCellsFilterTableDataArgsDict']]] = None,
            timeouts: Optional[pulumi.Input[Union['DataCellsFilterTimeoutsArgs', 'DataCellsFilterTimeoutsArgsDict']]] = None) -> 'DataCellsFilter':
        """
        Get an existing DataCellsFilter resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['DataCellsFilterTableDataArgs', 'DataCellsFilterTableDataArgsDict']] table_data: Information about the data cells filter. See Table Data below for details.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DataCellsFilterState.__new__(_DataCellsFilterState)

        __props__.__dict__["table_data"] = table_data
        __props__.__dict__["timeouts"] = timeouts
        return DataCellsFilter(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="tableData")
    def table_data(self) -> pulumi.Output[Optional['outputs.DataCellsFilterTableData']]:
        """
        Information about the data cells filter. See Table Data below for details.
        """
        return pulumi.get(self, "table_data")

    @property
    @pulumi.getter
    def timeouts(self) -> pulumi.Output[Optional['outputs.DataCellsFilterTimeouts']]:
        return pulumi.get(self, "timeouts")

