# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['CellArgs', 'Cell']

@pulumi.input_type
class CellArgs:
    def __init__(__self__, *,
                 cell_name: pulumi.Input[str],
                 cells: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Cell resource.
        :param pulumi.Input[str] cell_name: Unique name describing the cell.
               
               The following arguments are optional:
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cells: List of cell arns to add as nested fault domains within this cell.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        """
        pulumi.set(__self__, "cell_name", cell_name)
        if cells is not None:
            pulumi.set(__self__, "cells", cells)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="cellName")
    def cell_name(self) -> pulumi.Input[str]:
        """
        Unique name describing the cell.

        The following arguments are optional:
        """
        return pulumi.get(self, "cell_name")

    @cell_name.setter
    def cell_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "cell_name", value)

    @property
    @pulumi.getter
    def cells(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of cell arns to add as nested fault domains within this cell.
        """
        return pulumi.get(self, "cells")

    @cells.setter
    def cells(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "cells", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _CellState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 cell_name: Optional[pulumi.Input[str]] = None,
                 cells: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 parent_readiness_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Cell resources.
        :param pulumi.Input[str] arn: ARN of the cell
        :param pulumi.Input[str] cell_name: Unique name describing the cell.
               
               The following arguments are optional:
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cells: List of cell arns to add as nested fault domains within this cell.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] parent_readiness_scopes: List of readiness scopes (recovery groups or cells) that contain this cell.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if cell_name is not None:
            pulumi.set(__self__, "cell_name", cell_name)
        if cells is not None:
            pulumi.set(__self__, "cells", cells)
        if parent_readiness_scopes is not None:
            pulumi.set(__self__, "parent_readiness_scopes", parent_readiness_scopes)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN of the cell
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="cellName")
    def cell_name(self) -> Optional[pulumi.Input[str]]:
        """
        Unique name describing the cell.

        The following arguments are optional:
        """
        return pulumi.get(self, "cell_name")

    @cell_name.setter
    def cell_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cell_name", value)

    @property
    @pulumi.getter
    def cells(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of cell arns to add as nested fault domains within this cell.
        """
        return pulumi.get(self, "cells")

    @cells.setter
    def cells(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "cells", value)

    @property
    @pulumi.getter(name="parentReadinessScopes")
    def parent_readiness_scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of readiness scopes (recovery groups or cells) that contain this cell.
        """
        return pulumi.get(self, "parent_readiness_scopes")

    @parent_readiness_scopes.setter
    def parent_readiness_scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "parent_readiness_scopes", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class Cell(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cell_name: Optional[pulumi.Input[str]] = None,
                 cells: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides an AWS Route 53 Recovery Readiness Cell.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.route53recoveryreadiness.Cell("example", cell_name="us-west-2-failover-cell")
        ```

        ## Import

        Using `pulumi import`, import Route53 Recovery Readiness cells using the cell name. For example:

        ```sh
         $ pulumi import aws:route53recoveryreadiness/cell:Cell us-west-2-failover-cell us-west-2-failover-cell
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cell_name: Unique name describing the cell.
               
               The following arguments are optional:
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cells: List of cell arns to add as nested fault domains within this cell.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CellArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an AWS Route 53 Recovery Readiness Cell.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.route53recoveryreadiness.Cell("example", cell_name="us-west-2-failover-cell")
        ```

        ## Import

        Using `pulumi import`, import Route53 Recovery Readiness cells using the cell name. For example:

        ```sh
         $ pulumi import aws:route53recoveryreadiness/cell:Cell us-west-2-failover-cell us-west-2-failover-cell
        ```

        :param str resource_name: The name of the resource.
        :param CellArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CellArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cell_name: Optional[pulumi.Input[str]] = None,
                 cells: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CellArgs.__new__(CellArgs)

            if cell_name is None and not opts.urn:
                raise TypeError("Missing required property 'cell_name'")
            __props__.__dict__["cell_name"] = cell_name
            __props__.__dict__["cells"] = cells
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["parent_readiness_scopes"] = None
            __props__.__dict__["tags_all"] = None
        super(Cell, __self__).__init__(
            'aws:route53recoveryreadiness/cell:Cell',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            cell_name: Optional[pulumi.Input[str]] = None,
            cells: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            parent_readiness_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Cell':
        """
        Get an existing Cell resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: ARN of the cell
        :param pulumi.Input[str] cell_name: Unique name describing the cell.
               
               The following arguments are optional:
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cells: List of cell arns to add as nested fault domains within this cell.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] parent_readiness_scopes: List of readiness scopes (recovery groups or cells) that contain this cell.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CellState.__new__(_CellState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["cell_name"] = cell_name
        __props__.__dict__["cells"] = cells
        __props__.__dict__["parent_readiness_scopes"] = parent_readiness_scopes
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Cell(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN of the cell
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="cellName")
    def cell_name(self) -> pulumi.Output[str]:
        """
        Unique name describing the cell.

        The following arguments are optional:
        """
        return pulumi.get(self, "cell_name")

    @property
    @pulumi.getter
    def cells(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of cell arns to add as nested fault domains within this cell.
        """
        return pulumi.get(self, "cells")

    @property
    @pulumi.getter(name="parentReadinessScopes")
    def parent_readiness_scopes(self) -> pulumi.Output[Sequence[str]]:
        """
        List of readiness scopes (recovery groups or cells) that contain this cell.
        """
        return pulumi.get(self, "parent_readiness_scopes")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

